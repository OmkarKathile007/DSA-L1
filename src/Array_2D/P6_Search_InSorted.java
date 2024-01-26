package Array_2D;

public class P6_Search_InSorted {
    //      Time Complexity O(m+n)

    // Top to Bottom Approach
    public static boolean StairCaseDown(int [][]arr,int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<= arr.length-1 && col>=0){
            if (arr[row][col]==key){
                System.out.print("Key Found at Index : ( "+row+" ,"+col+ ")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not Found");
        return false;
    }


    // Bottom To Top
    public static boolean StaircaseUp(int arr[][],int key){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col< arr.length){
            if (arr[row][col]==key){
                System.out.print("Key Found at Index : ( "+row+" ,"+col+ ")");
                return true;
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key Not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int key=30;
//        StairCaseDown(arr,key);
        StaircaseUp(arr,key);

    }
}
