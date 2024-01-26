package Recursion;

import java.util.ArrayList;

public class P13_DigitCount {
    public static void DigitCount(int num){

        String st1[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        if (num==0){
            return;
        }

        int lastdigit=num%10;
        DigitCount(num/10);
        System.out.print(st1[lastdigit]+" ");




    }
    public static void main(String[] args) {
        DigitCount(2019);
    }
}
