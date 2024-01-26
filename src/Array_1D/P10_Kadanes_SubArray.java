package Array_1D;

import java.util.Arrays;

public class P10_Kadanes_SubArray {

    public static void Kadanes(int arr[]){
        int currentSum=0;
        int Maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            Maxsum=Math.max(currentSum,Maxsum);
        }
        System.out.println("Maximum SumArray :"+Maxsum);
    }
  public static void Kadane2(int arr[]){
        int currentsum=0;
        int Maxsum= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(Maxsum<currentsum){
                Maxsum=currentsum;
            }
            if (currentsum<0){
                currentsum=0;
            }
        }
        System.out.println("Max sum :"+Maxsum);

    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        Kadanes(arr);
        int arr2[]={-1,-2,-3,-4};
        Kadane2(arr2);

    }
}
