package Array_1D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P18_SecondLargest {
    public static int SecondLargest(int []arr){
        // My approach
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        boolean flag=true;
        for(int i=0;i< arr.length;i++){
            if (max1<arr[i]){
                max1=arr[i];
            }
        }
        for (int j=0;j<arr.length;j++){
            if (max1==arr[j]){
                continue;
            }
            if (max2<arr[j]){
                max2 = arr[j];
            }
        }
        return max2;

    }
    // Second Largest
    public static int SeconLarg(int arr[] ,int n){
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if (arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Array1[]={34,21,54,65,43};
        int Array2[]={4,3,6,7,1};
        System.out.println("Second Largest Element In Array1 : "+SecondLargest(Array1));
        System.out.println("Second Largest Element In Array2 : "+SeconLarg(Array1,Array1.length));
    }
}
