package Recursion;

import java.util.ArrayList;

public class FirstOccurence {
    public static void FirstOccur(int []arr, int i, int key ){

        if (i>=arr.length){
            return;
        }
        if (arr[i]==key){
            System.out.print(i+" ");
        }

        FirstOccur(arr, i + 1, key);


    }
    public static void main(String[] args) {
        int arr[]= {3, 2, 4, 5, 6, 2, 7, 2, 2};
        FirstOccur(arr,0,2);
    }
}
