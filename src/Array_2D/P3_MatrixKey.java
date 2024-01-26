package Array_2D;

import java.util.Scanner;

public class P3_MatrixKey {
    public static boolean MatrixAtKey(int arr[][],int key){
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==key){

                    System.out.println("Key Found at Index ( "+i+" , "+j+ " )");
                    return true;
                }

            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        MatrixAtKey(arr,5);


        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
