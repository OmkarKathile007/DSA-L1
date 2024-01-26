package Divide_N_Conquer;

public class P1_Merge_Sort {
    public static void Traverse(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        MergeSort(arr,si,mid);         // Left Part
        MergeSort(arr,mid+1,ei);  // Right Part
        Merge(arr,si,ei,mid);

    }
    public static void Merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;  // first sorted
        int j=mid+1;  // second sorted
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //  for leftover element of the 1st sorted part
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        // for leftover element of the 2nd sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temporary to Original array
        for(k=0,i=si;k< temp.length;i++,k++){
            arr[i]=temp[k];
        }



    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        String str[]={"sun", "earth", "mars", "mercury"};
        MergeSort(arr,0,arr.length-1);
        Traverse(arr);
    }
}
