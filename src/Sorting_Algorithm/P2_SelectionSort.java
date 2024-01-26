package Sorting_Algorithm;

public class P2_SelectionSort {
    public static void SelectionSort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j< arr.length;j++){
                if (arr[minPos]>arr[j]){
                    j=minPos;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);

    }
}
