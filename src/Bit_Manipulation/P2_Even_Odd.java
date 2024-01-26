package Bit_Manipulation;

public class P2_Even_Odd {
    public static void Even_Odd(int n){
        int BitMask=1;
        if ((n & BitMask)==0){
            System.out.println("Even Number ");
        }
        else{
            System.out.println("Odd Number ");
        }
    }
    public static void main(String[] args) {
       Even_Odd(7);
       Even_Odd(3);
       Even_Odd(8);
    }
}
