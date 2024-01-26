package Recursion;

import java.util.ArrayList;

//Question1:For a given integer array of sizeN. You have to find all the occurrences (indices) of a given element (Key) and print them.
//        Use a recursive function to solve this problem
public class Questions1 {
    // My Approach
    public static void KeyFind(int arr[],int key,int i,String st1){

        ArrayList<Integer> al= new ArrayList<>();
        if (i== arr.length){
            System.out.println(st1);
            return ;
        }
        if (arr[i]==key){
            st1+=i+" ";
            KeyFind(arr,key,i+1,st1);
        }else {
            KeyFind(arr, key, i + 1,st1);
        }

    }
    public static void AllOccurence(int arr[],int key,int index){
        if(index== arr.length){
            return;
        }
        if(arr[index]==key){
            System.out.print(index+" ");

        }
        AllOccurence(arr,key,index+1);
    }
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        KeyFind(arr,2,0,"");
        AllOccurence(arr,2,0);
    }
}
