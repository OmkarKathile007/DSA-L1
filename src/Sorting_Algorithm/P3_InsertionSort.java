package Sorting_Algorithm;

public class P3_InsertionSort {
    public static void InsertSort(int arr[]){

        //Time Complexity O(n^2)

        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int previous=i-1;
            while(previous>=0 && arr[previous]>curr){
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=curr;
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,5,6,3,4};
        InsertSort(arr);
    }
}
