package Divide_N_Conquer;

public class P2_Quick_Sort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Pivot(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIndx=Partition(arr,si,ei);
        Pivot(arr,si,pIndx-1);
        Pivot(arr,pIndx+1,ei);

    }
    public static int Partition(int arr[],int si,int ei){
        int Pindex=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<arr[ei]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=Pindex;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        Pivot(arr,0, arr.length-1);
        printArr(arr);

    }
}
