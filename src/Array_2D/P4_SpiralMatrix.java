package Array_2D;

public class P4_SpiralMatrix {
    public static void SpiralMatrix(int arr[][]){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol ;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            for (int i=endrow-1;i>=startcol+1;i--){
                if (startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }

    }
    public static void Spiral(int [][]arr){
        int startcol=0;
        int startrow=0;

    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                        {13,14,15,16}};
//        for (int i=0;i< matrix.length;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        SpiralMatrix(matrix);

    }
}
