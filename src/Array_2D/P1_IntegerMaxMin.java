package Array_2D;

import java.util.Scanner;

public class P1_IntegerMaxMin {
    public static void MinMax(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
                if (min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Maximum Number In Array : "+max);
        System.out.println("Minimum Number In Array : "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[3][3];

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                array[i][j]=sc.nextInt();
            }
        }

        MinMax(array);
    }
}
