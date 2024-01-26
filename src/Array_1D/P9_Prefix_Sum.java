package Array_1D;

public class P9_Prefix_Sum {
// Prefix SubArray Sum = which subArray Contains Maximum Number Sum
    public static void PrefixSum1(int arr[]){
        int largest=Integer.MIN_VALUE;
        int currentSum=0;
        int start,end;
        int prefixSum[]= new int[arr.length];
        prefixSum[0]=arr[0];
        for (int i=1;i<prefixSum.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for (int i=0;i< arr.length;i++){
            start=i;
            for (int j=i;j<arr.length;j++){
                end=j;
//                currentSum = i==0 ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
                if(i==0){
                    currentSum=prefixSum[j];
                }
                else{
                    currentSum=prefixSum[j]-prefixSum[i-1];
                }
                if (largest<currentSum){
                   largest = currentSum;
                }
            }
        }
        System.out.println("Max Element :"+largest);
    }
    public static void main (String[]args){
        int[] arr = {1,-2,6,-1,3};
        PrefixSum1(arr);
    }
}

