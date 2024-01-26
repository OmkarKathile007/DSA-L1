package Recursion;

public class X_2_Power_n {

    // Time Complexity O(2^n)
    public static int XPower_n(int X,int n){
        if (n==0){
            return 1;
        }
        return X*XPower_n(X,n-1);
    }


    // Time Complexity O(logn) - Optimized Approach
    public static int XpowerN_Optimized(int X,int n){
        if (n==0){
            return 1;
        }
        int square=XpowerN_Optimized(X,n/2);
        int PowSquare=square*square;
        if(n%2 != 0){
            PowSquare=X*PowSquare;
        }
        return PowSquare;
    }
    public static void main(String[] args) {
//        XPower_n(2,10);
        System.out.println(XpowerN_Optimized(2,11));

    }
}
