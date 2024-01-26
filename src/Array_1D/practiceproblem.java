package Array_1D;

import java.util.*;
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int index=0;

        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        for(int i=index+1;i<arr.length;i++){
            if(max2<arr[i] && arr[i]!=max){
                max2=arr[i];
            }
        }
        al.add(max);
        al.add(max2);
        al.add(arr[n-1]);
        return al;
    }
}
