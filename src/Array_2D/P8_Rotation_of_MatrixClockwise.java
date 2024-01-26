package Array_2D;

import java.util.Arrays;
import java.util.Scanner;

public class P8_Rotation_of_MatrixClockwise {
    public static void RotateClockwise(int [][]arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <arr[0].length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        System.out.println();
        int li = 0;
        int ri = n-1;
        for (int i = 0; i < n ; i++) {
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
            }
            li++;
            ri--;
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[][]= {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        int nums1[][]={{1,2,3}
                       ,{4,5,6},
                        {7,8,9}};

        RotateClockwise(nums1);
        for(int i=0;i< nums1.length;i++){
            for (int j=0;j< nums1[0].length;j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
