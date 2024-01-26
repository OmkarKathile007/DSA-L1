package Array_2D;

import java.util.Scanner;

public class Zpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                if (i==0 || i+j==(arr.length-1) || i==(arr.length-1)){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
