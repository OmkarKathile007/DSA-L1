package BackTrack;

public class Numbers {

    static void Print1(int n){
        if(n<1){
            return;
        }
        Print1(n-1);
        System.out.println(n*10);
    }

//     TimeComplexity-> O(n)  SpaceComplexity-> O(n)=> Stack Memory Space
    static void Print2(int i){
        if (i>10){
            return;
        }
        Print2(i+1);
        System.out.println(i);
    }

    //   Parameter Function
    static int sum(int n){
        if (n==0){
            return 0;
        }
        return n+sum(n-1);
    }


//    static void Reverse(int arr[],int i){
//        if (i== arr.length){
//            return;
//        }
//        Reverse(arr,i+1);
//        System.out.print(arr[i]+" ");
//    }

    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void Reverse1(int arr[],int i,int n){
        if (i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);

        Reverse1(arr,i+1,n);
    }
    static boolean Pallindrome(String str,int i,int n){
        if (i>=n/2){
            return true;
        }
        if (str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        return Pallindrome(str,i+1,n);
    }



    // Reverse Array
    public static void main(String[] args) {
//        Print1(10);
//        Print2(1);
//        System.out.println(sum(5));

//        int arr[]={1,2,3,4,5};
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        Reverse1(arr,0,arr.length);
//        System.out.println();
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        System.out.println(Pallindrome("madem",0,5));
    }
}
