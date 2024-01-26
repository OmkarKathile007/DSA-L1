import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]= new int[2];



        for(int i=0;i<nums.length;i++){

            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    a[i]=i;
                    a[j]=j;
                    System.out.println(a[i]+","+a[j]);
                    break;
                }
            }
        }
        return nums;

    }
}
public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        int target=9;

        Solution s1 = new Solution();
        s1.twoSum(nums,target);
    }
}
