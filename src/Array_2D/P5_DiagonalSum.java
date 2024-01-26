package Array_2D;

import java.util.Scanner;

public class P5_DiagonalSum {
    public static int DiagonalSum(int arr[][]){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i][i];            // To calculate First Diagonal Sum
            if (i!= arr.length-1-i){   // To Calculate Second Diagonal Sum  i+j=arr.length-1 ==> j=arr.length-1-i
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matrix[][]=new int[4][4];
        for (int i=0;i<Matrix.length;i++){
            for (int j=0;j<Matrix[0].length;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(DiagonalSum(Matrix));

    }
}
