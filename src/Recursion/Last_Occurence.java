package Recursion;

public class Last_Occurence {
    public static int LastOccurence(int arr[],int key,int i){
        if (i== arr.length){
            return -1;
        }
        int isFound=LastOccurence(arr,1,i+1);
        if (isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,1,7,9,8,6,1,5};
        System.out.println(LastOccurence(arr,1,0));
    }
}
