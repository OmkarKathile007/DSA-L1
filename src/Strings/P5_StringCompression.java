package Strings;

public class P5_StringCompression {
    public static String ToCompression(String str){
        String str1="";

        for (int i=0;i<str.length();i++){
           Integer count =1;
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
               count ++;
               i++;
           }
           str1+=str.charAt(i);
           if (count>1){
               str1+=count.toString();
           }
        }
        return str1;
    }
    public static void main(String[] args) {
        System.out.println(ToCompression("aaabbcccdd"));
    }
}
