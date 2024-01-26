package Array_1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class P14_DuplicateInArray {

//    Time Complexity O(n^2) Which is Brute Force Approach
    public static boolean Duplicate(int []nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Hashset(int nums[]){
        HashSet<Integer> num= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if (num.contains(nums[i])){
                return true;
            }
            else{
                num.add(nums[i]);
            }
        }
        return false;
    }


    public static ArrayList Duplicates(int nums[],int n){
        int temp[]=new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            temp[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if (temp[i]>1){
                al.add(i);
            }
        }
        if(al.isEmpty()){
            al.add(-1);
            return al;
        }
        return al;

    }
    public static void main(String[] args) {
        int nums[]={ 1, 1, 3, 34, 4, 3, 2, 4, 2,6,7,7};
        System.out.println(Duplicate(nums));
        System.out.println(Duplicates(nums, nums.length));
    }

}
