package Sorting_Algorithm;

public class P4_CountSort {
    public static void CountSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }


        for (int i=0;i< count.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        CountSort(arr);
    }
}
