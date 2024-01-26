package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "appnnacollege";
        ArrayList al = new ArrayList();
        char ch[]= str.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i< ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                al.add(ch[i]);
            }
        }
        System.out.println(al);
    }
}
