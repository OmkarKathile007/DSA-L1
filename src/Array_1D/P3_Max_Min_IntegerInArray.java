package Array_1D;

public class P3_Max_Min_IntegerInArray {
    public static int Max_IntegerInArray(int []arr){
        int largest = Integer.MIN_VALUE;   // it stores  - Infinity Value
        for (int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int Min_IntegerInArray(int []arr){
        int smallest = Integer.MAX_VALUE;  // it stores + Infinity Value
        for (int i=0;i<arr.length;i++){
            if (smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,7,8,9,10};

        int max = Max_IntegerInArray(arr);
        int min=Min_IntegerInArray(arr);
        System.out.println("Largest Number in Array : "+max);
        System.out.println("Smallest Number in Array : "+min);

    }
}
