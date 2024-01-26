package BackTrack;

import java.util.ArrayList;

public class Subsequence {

    static void Subsequence(int arr[], int indx, ArrayList<Integer> al,int n){
        if (indx==n){
            System.out.println(al);
            return;
        }
        al.add(arr[indx]);
        Subsequence(arr,indx+1,al,n);
        al.remove(al.size()-1);
        Subsequence(arr,indx+1,al,n);
    }

    static void SubsequenceSum(int arr[],int i,ArrayList<Integer> al,int n,int sum,int k){
        if (i==n){
            if (sum==k){
                System.out.println(al);
            }
            return;
        }
        al.add(arr[i]);
        sum+=arr[i];
        SubsequenceSum(arr,i+1,al,n,sum,k);
        sum-=arr[i];
        al.remove(al.size()-1);
        SubsequenceSum(arr,i+1,al,n,sum,k);
    }

    static int SubsequenceSum1(int arr[],int i,ArrayList<Integer> al,int n,int sum,int k){
        if (i==n){
            if (sum==k){
                System.out.println(al);
            }
            return 0;
        }
        al.add(arr[i]);
        sum+=arr[i];
        return SubsequenceSum1(arr,i+1,al,n,sum,k);
        sum-=arr[i];
        al.remove(al.size()-1);
        return SubsequenceSum1(arr,i+1,al,n,sum,k);
    }



    static boolean SubsequenceSumONLYONE(int arr[],int i,ArrayList<Integer> al,int n,int sum,int k){
        if (i==n){
            if (sum==k){
                System.out.println(al);
                return true;
            }
            return false;
        }
        al.add(arr[i]);
        sum+=arr[i];
        if (SubsequenceSumONLYONE(arr,i+1,al,n,sum,k)==true){
            return true;
        }
        sum-=arr[i];
        al.remove(al.size()-1);
        if(SubsequenceSumONLYONE(arr,i+1,al,n,sum,k)==true) {
            return true;
        }
        return false;
    }

    static int SubsequenceCount(int arr[],int i,int n,int sum,int k){
        if (i==n){
            if (sum==k){
                return 1;
            }
            return 0;
        }
        sum+=arr[i];
        int left=SubsequenceCount( arr, i+1, n,sum, k);
        sum-=arr[i];
        int right=SubsequenceCount( arr, i+1, n,sum, k);

        return left+right;
    }

    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=3;
        ArrayList<Integer> al=new ArrayList<>();
//        Subsequence(arr,0,al,n);
        SubsequenceSum(arr,0,al,n,0,2);
        SubsequenceSumONLYONE(arr,0,al,n,0,2);
        System.out.println(SubsequenceCount(arr,0,n,0,2));
    }
}
