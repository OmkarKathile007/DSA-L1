package Recursion;

import java.util.ArrayList;

public class SubSequenceArray {
    public static void SubSequence(int arr[], int ind, ArrayList al,int n){
        if (ind==n){
            System.out.println(al);
            return;
        }
        al.add(arr[ind]);
        SubSequence(arr,ind+1,al,n);

        al.remove(al.size()-1);
        SubSequence(arr,ind+1,al,n);
    }
    public static void main(String[] args) {
        int arr[]={5,2,1};
        int n = 3;
        SubSequence(arr,0,new ArrayList(),n);
    }
}
