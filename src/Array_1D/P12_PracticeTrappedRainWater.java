package Array_1D;

public class P12_PracticeTrappedRainWater {

    public static int TrappedWater(int []ht){
        int size=ht.length;
        int leftMax[]= new int[size];
        leftMax[0]=ht[0];
        for (int i=1;i<size;i++){
            leftMax[i]=Math.max(ht[i],leftMax[i-1]);
        }
        int Rightmax[] = new int[size];
        Rightmax[size-1]=ht[size-1];
        for (int i=size-2;i>=0;i--){
            Rightmax[size-1]=Math.max(ht[i],Rightmax[i+1]);
        }
        int trappedWater=0;
        for (int i=0;i<size;i++){
            int Waterlevel=Math.min(leftMax[i],Rightmax[i]);
            trappedWater+=Waterlevel-ht[i];
        }
        return trappedWater;


    }
    public static void main(String[] args) {
        int height[]={3,1,5,2,1,4,2,5};
        System.out.println(TrappedWater(height));
    }
}
