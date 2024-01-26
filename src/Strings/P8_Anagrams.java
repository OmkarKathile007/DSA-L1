package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P8_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Characters");
        int l1=sc.nextInt();

        String st1=sc.next();
        String st2=sc.next();
        if (st1.length()!=st2.length()){
            System.out.println("Both string length should be same");
        }

        st1.replace(" ","");
        st2.replace(" ","");


        char ch1[]=st1.toCharArray();
        char ch2[]=st2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean b = false;

        for (int i=0;i<ch1.length;i++){
            if(ch1[i]==ch2[i] ){
                b=true;
            }
            if (ch1[i]!=ch2[i]){
                b=false;
                break;
            }
        }
        if (b==true){
            System.out.println(" Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }
}
