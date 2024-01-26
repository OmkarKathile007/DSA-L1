package Array_1D;

import java.util.Scanner;

public class P1_Linear_Search {
    public static int LinearSearch(int array[],int key){
        for (int i=0;i<array.length;i++){
            if (array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[10];
        System.out.println("Enter Your Array Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Your key");
        int key = sc.nextInt();
        int index = LinearSearch(arr,key);
        if (index==-1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key Found at index "+index);
        }

    }
}
