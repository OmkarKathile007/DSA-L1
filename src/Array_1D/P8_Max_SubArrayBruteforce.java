package Array_1D;

public class P8_Max_SubArrayBruteforce {
    public static void BruteForce(int array[]){
        int sumArray;

        int MaxArray=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            for (int j=i;j< array.length;j++){
                sumArray=0;
                for (int k=i;k<=j;k++){
                    sumArray+=array[k];
                }
                System.out.println(sumArray);
                if (MaxArray<sumArray){
                    MaxArray=sumArray;
                }
            }
        }
        System.out.println("Maximum Number In Array :"+MaxArray);
    }

    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12};
        BruteForce(array);

    }
}
