package Bit_Manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Decimal2Binary {
    public static String Binary2Decimal(int n){
        String decimal="";
        while (n!=0){
            int x=n%2;
            decimal=x + decimal;
            n=n/2;
        }
        return decimal;
    }

    public static int Decimal_2Binary(String s){
        int pow2=1;
        int i=0;
        int res=0;
        while (i<s.length()){
            if (s.charAt(i)=='1'){
                res=res+pow2;
            }
            pow2=pow2*2;
            i++;
        }
        return res;

    }
    public static long rev(long x ){
        StringBuilder sb = new StringBuilder(""+x);
        sb.reverse();
        long s = Long.parseLong(sb+"");
        return s;
    }

    public static void main(String[] args) {

     int x=345;
        System.out.println(rev(x));


    }
}
