package Array_1D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
public class P15_TripletSumZero {
    public static List<List<Integer>> TripletSum(int nums[]){
        List<List<Integer>> ls = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                for (int k=j+1;k< nums.length;k++){
                    if ((nums[i]+nums[j]+nums[k])==0){
                        System.out.print("( "+nums[i]+" "+nums[j]+" "+nums[k]+" )"+ " ");
                        List<Integer> al= new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        Collections.sort(al);
                        ls.add(al);

                    }
                }

            }

        }
         ls= new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(ls));
        return ls;
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,4};
        TripletSum(nums);

    }
}
