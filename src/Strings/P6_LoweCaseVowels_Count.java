package Strings;

import java.util.Scanner;

public class P6_LoweCaseVowels_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String str=sc.next();

        int count =0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Your Name Contains "+count+" Vowels");
    }
}
