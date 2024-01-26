package Array_1D;

public class P17_ArrayTraverseEven {

    public static void TraverseOverEven(int []arr1){
        for (int i=0;i< arr1.length;i++){
            if (arr1[i]%2==0){
                System.out.print(arr1[i]+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int input1[]={34,21,54,65,43};
        int input2[]={4,3,6,7,1};
        TraverseOverEven(input1);
        TraverseOverEven(input2);
    }
}
