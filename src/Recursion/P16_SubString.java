package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class P16_SubString {
    public static void printRow(StringBuilder str,int i){
        if (i<=str.length()){
            System.out.println(str);
        }
    }
    public static void SubString(String str,StringBuilder newstr,int i){
        if (i==str.length()){
            System.out.print(newstr+" ");
            return;
        }

        SubString(str,newstr.append(str.charAt(i)),i+1);
        printRow(newstr,i);


    }


    public static void Subsequence(String str,String s1,int i){
        if (i==str.length()){
            System.out.println(s1);
            return;
        }

        Subsequence(str,s1+=str.charAt(i),i=i+1);
        Subsequence(str,s1+=str.charAt(i),i);
        System.out.println(s1);
    }


    public static void SubSeq(int i, ArrayList<Integer> al,int arr[],int n){
        if (i==n){
            System.out.println(al);;
            return;
        }

        al.add(arr[i]);
        SubSeq(i+1,al,arr,n);
        al.remove(arr[i]);
        SubSeq(i+1,al,arr,n);
    }


    public static void main(String[] args) {
//        String str="abc";
//        SubString(str,new StringBuilder(""),0);


//        Subsequence("abc","",0);
        int arr[]={3,1,2};
        SubSeq(0,new ArrayList<>(),arr,arr.length);
    }
}
