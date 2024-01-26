package Recursion;

public class P15_MultiplicationTable {
    public static void Mutliply(int n,int i){
        if(i>10){
            return;
        }
        System.out.println(n +" x "+i+" = "+n*i);

        Mutliply(n,i+1);


    }
    public static void main(String[] args) {
        Mutliply(10,1);
    }
}
