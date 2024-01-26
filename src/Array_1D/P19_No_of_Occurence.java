package Array_1D;

import Divide_N_Conquer.Occurence;
import Recursion.Array_Sorted;

import java.util.ArrayList;
import java.util.Arrays;

public class P19_No_of_Occurence {
    public static ArrayList Occurence(int arr[]){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arrayList.add(arr[i]);
                }
            }
        }
        return arrayList;
    }
    public static String Occurence1(int arr[]){
        Arrays.sort(arr);
        int temp[]= new int[2];
        for(int i= arr.length-2;i>=0;i--){
            if(i>=0){
                if (arr[i]==arr[i-1]){
                    temp[i]+=arr[i];
                }
            }
        }
        return temp[0] +" "+temp[1]+" "+temp[2];

    }
    public static void main(String[] args) {
        int arr[]={3,1,2,3,4,2};
        System.out.println(Occurence1(arr));
    }
}
