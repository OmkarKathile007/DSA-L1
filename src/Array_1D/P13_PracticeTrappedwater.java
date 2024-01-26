package Array_1D;

public class P13_PracticeTrappedwater {
    public static int TrappedWater(int height[]){
        int n=height.length;
         int LeftMax[] = new int[n];
         LeftMax[0]=height[0];
         for (int i=1;i<n;i++){
             LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
         }
         int Rightmax[] = new int[n];
         Rightmax[n-1]=height[n-1];
         for (int i=n-2;i>=0;i--){
             Rightmax[i]=Math.max(height[i],Rightmax[i+1]);

         }
         int trappedWater=0;
         for (int i=0;i<n;i++){
             int waterlevel=Math.min(LeftMax[i],Rightmax[i]);
             trappedWater+=waterlevel-height[i];

         }
         return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int height1[]={4,2,0,3,2,5};
        System.out.println(TrappedWater(height));
        System.out.println(TrappedWater(height1));
    }
}
