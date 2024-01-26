package Array_2D;

public class P7_Practice {
    public static void main(String[] args) {

//     Question 1 :Print the number of 7’s that are in the 2d array
//        int[][] array = { {4,7,8},{8,8,7} };
//        int num=7;
//        int count =1;
//        for (int i=0;i< array.length-1;i++) {
//            for (int j = 0; j <= array.length-1; j++) {
//                if (array[i][j] == num) {
//                     count++;
//                }
//            }
//        }
//        System.out.println(count);

//     Question 2 :Print out the sum of the numbers in the second row of the “nums” array
//        O(n^2)
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        int sum=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j< nums.length;j++){
                if (i==1){
                    sum+=nums[i][j];
                }
            }
        }
        System.out.println(sum);

        int nums1[][]={ {1,4,9},{11,4,3},{2,2,3} };
        int sum1=0;
        for (int j=0;j<=nums.length-1;j++){
            sum1+=nums[1][j];

        }
        System.out.println("Sum of Second Rows are :"+sum1);

    }
}
