package Array_1D;

public class P11_TrappedRainWater {
    public static int TrappedWater(int height[]){
        int n = height.length;
        // To calculate MaxLeftBoundary  of Bar
        int LeftMaxArray[]= new int[n];
        LeftMaxArray[0]=height[0];
        for(int i=1;i<n;i++){
            LeftMaxArray[i]=Math.max(height[i],LeftMaxArray[i-1]);
        }


        // To calculate MaxRightBoundary  of Bar
        int RightMaxArray[]=new int[n];
        RightMaxArray[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            RightMaxArray[i]=Math.max(height[i],RightMaxArray[i+1]);
        }

        int trappedWater=0;
        int Waterlevel;
        // To calculate  WaterLevel
        for (int i=0;i<n;i++){
             Waterlevel=Math.min(LeftMaxArray[i],RightMaxArray[i]);
            // To calculate Trapped Water inside Water
            trappedWater+=Waterlevel-height[i];
        }
    return trappedWater;
    }

    public static void main(String[] args) {
//        int height[]={4,2,0,6,3,2,5};
        int height[]={3,1,5,2,1,4,2,5};
        System.out.println(TrappedWater(height));
    }
}
