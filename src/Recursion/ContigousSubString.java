package Recursion;

public class ContigousSubString {


    public static void ContinousSubstring(String str,String s2,int i){

        if(i==str.length()){

            return;
        }
        s2+=str.charAt(i);

        System.out.println(s2);
        ContinousSubstring(str,s2,i=i+1);

    }
    public static void main(String[] args) {
        String str ="abcab";
        for(int i=0;i<str.length();i++){
            ContinousSubstring(str.substring(i,str.length()),"",0);
        }

        String p="AB";
        char ch[]=p.toCharArray();
        System.out.println(ch[0]);
    }
}
