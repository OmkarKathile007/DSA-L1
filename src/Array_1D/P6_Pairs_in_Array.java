package Array_1D;

public class P6_Pairs_in_Array {
    public static void Pairs_Array(int array[]){

        //  MY approach
        for (int i=0;i< array.length-1;i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    continue;
                }
                System.out.print("( " + array[i] + " ," + array[j] + " )");
            }
            System.out.println();
        }
//        }
        int total_pairs=0;
        for (int i=0;i< array.length-1;i++){
            int current=array[i];
            for (int j=i+1;j< array.length;j++){

                System.out.print("( "+current+" ,"+array[j]+" )");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs in Array "+total_pairs);
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        Pairs_Array(array);

    }
}
