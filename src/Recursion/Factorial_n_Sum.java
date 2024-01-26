package Recursion;

public class Factorial_n_Sum {
    public static int Fact(int n){
        if (n==1){
//            System.out.print(1);
            return 1;
        }
        return n*Fact(n-1);
    }
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Sm1=Sum(n-1);
        int Sn=n+Sm1;
        return Sn;
    }
    public static void main(String[] args) {
        System.out.println(Fact(5));
        System.out.println(Sum(5));
    }
}
