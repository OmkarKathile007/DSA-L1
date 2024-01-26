package Recursion;

public class Increase_Decrease {
    public static void PrintDec(int num){
        if (num==1){
            System.out.print(1);
            return;
        }
        System.out.print(num+" ");
        PrintDec(num-1);       // This Function will Call itself till it reaches to the Base Case
    }
    public static void PrintInc(int n){
        if (n==1){
            System.out.print(1+" ");
            return;
        }
        PrintInc(n-1);          // This Function will Call itself until it reaches to the Base Case i.e 1
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
//        PrintDec(10);
        PrintInc(5);
    }
}
