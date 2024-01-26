package Array_1D;

public class P4_Binary_Search {



    //  For Ascending Sorted Arrray
    public static int BinarySearch(int arr[],int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
           if (arr[mid]==key){
               return mid;
           }
           if (arr[mid]<key){
               mid=mid+1;
           }
           else{
               mid=mid-1;
           }
        }
        return -1;
    }

    // For Descending Sorted Array
    public static int DescendingSortedArray(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){
                mid=mid-1;
            }
            else{
                mid=mid+1;
            }
        }
        return -1;

    }
    public static int ModifyBinary(int arr[],int key,int si,int ei){
        int mid = si+(ei-si)/2;
        while(si<=ei){
            if (arr[mid]==key){
                return mid;
            }
            if (arr[si]<arr[mid]){
                if (arr[si]<=key && key < arr[mid]){
                    mid=mid-1;
                }
                else{
                     si++;
                }
            }
            else{
                  if (arr[mid+1]<=key && key<=arr[ei]){
                      mid=mid+1;
                  }
                  else{
                      ei--;
                  }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int arr[]={2,4,6,8,10,12,10,12,5};
//
//        int key =10;
//
//
//       int index=BinarySearch(arr,key);
//       if (index==-1){
//           System.out.println("Key Not Found");
//       }
//       else {
//           System.out.println("Key found at index :"+index);
//       }

        // Descending Sorted Array
//        int arr2[]={12,10,8,6,4,2};
//        int key=10;
//        int index=DescendingSortedArray(arr2,10);
//        if (index==-1){
//           System.out.println("Key Not Found");
//       }
//        else {
//           System.out.println("Key found at index :"+index);
//       }


        // ModifyBinary
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(ModifyBinary(arr,1,0, arr.length-1));


    }
}
