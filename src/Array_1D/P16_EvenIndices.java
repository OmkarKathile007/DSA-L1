package Array_1D;

public class P16_EvenIndices {
    public static int IndiceSum(int []nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if (i%2==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int input1[]={3,20,4,6,9};
        int input2[]={4,3,6,7,1};
        System.out.println(IndiceSum(input1));
        System.out.println(IndiceSum(input2));
    }
}
