package Divide_N_Conquer;

public class P3_Sorted_N_RotatedSearch {
    public static void PrintArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int Search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=target){
            if(arr[si]<=target && target<=arr[mid]){
                return Search(arr,target,si,mid-1);
            }
            else{
                return Search(arr,target,mid+1,ei);
            }
        }
        else{
            if(arr[mid]<=target && target <=arr[ei]){
                return Search(arr,target,mid+1,ei);
            }
            else{
                return Search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};


        int tar=1;
        int tarIndx=Search(arr,tar,0,arr.length-1);
        System.out.println(tarIndx);


    }
}
