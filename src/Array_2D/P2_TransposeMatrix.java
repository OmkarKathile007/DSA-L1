package Array_2D;

import java.util.Scanner;

public class P2_TransposeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }



    }
}
