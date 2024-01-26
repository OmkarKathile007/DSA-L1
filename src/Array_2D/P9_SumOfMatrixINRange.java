package Array_2D;

public class P9_SumOfMatrixINRange {
    public static int SumofMatrix(int [][]arr,int r1,int r2,int c1,int c2){
        int sum=0;
        for (int i=r1;i<=r2;i++){
            for (int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,1},
                    {1,1,1,1}};
        int r1=0;
        int r2=3;
        int c1=2;
        int c2=3;
        int result=SumofMatrix(arr,r1,r2,c1,c2);
        System.out.println(result);
    }
}
