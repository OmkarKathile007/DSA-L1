package Divide_N_Conquer;

public class Occurence {
    public static void Occurence(int arr[]){
        int occur1=0;
        int occur2=0;
        int ONum1=0;
        int ONum2=0;
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    occur1++;
                    ONum1=arr[i];
                }
                else{
                    occur2++;
                    ONum2=arr[i];
                }
            }
        }
        if (occur1>occur2){
            System.out.println(ONum1);
        }
        else{
            System.out.println(ONum2);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        Occurence(arr);
    }
}
