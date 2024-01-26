package Array_2D;

class MatrixSpiral {
    public static void SpiralMatrix(int n) {
        int arr[][]=new int[n][n];
        int startrow = 0;
        int endrow = arr.length - 1;
        int startcol = 0;
        int endcol = arr[0].length - 1;
        int k = 1;

        while (startrow <= endrow && startcol <= endcol) {
            for (int j = startcol; j <= endcol; j++) {
                arr[startrow][j] = k;
                k++;
            }
            for (int i = startrow + 1; i <= endrow; i++) {
                arr[i][endcol] = k;
                k++;
            }
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                arr[endrow][j] = k;
                k++;
            }
            for (int i = endrow - 1; i >= startcol + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                arr[i][startcol] = k;
                k++;
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        MatrixSpiral ms = new MatrixSpiral();
        SpiralMatrix(3);


    }

}
