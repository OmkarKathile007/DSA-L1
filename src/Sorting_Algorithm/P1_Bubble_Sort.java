package Sorting_Algorithm;

public class P1_Bubble_Sort {

    // Bubble Sort will sort the Array in ascending as well as descending
    public static void BubbleSort(int arr[]){
        int swap=0;
        for (int turns=0;turns<arr.length-1;turns++){
            for (int j=0;j<arr.length-1-turns;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }

            }


        }

        System.out.println("Number of Swap helds : "+swap);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void DesBubbleSort(int []arr){
        int swap=0;
        for (int i=arr.length-1;i>0;i--){
            for (int j= arr.length-1-i;j>0;j--){
                if (arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                swap++;

            }
        }
        System.out.println(swap);
        for (int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,8,4,9,0};
        BubbleSort(arr);
//        DesBubbleSort(arr);
    }
}
