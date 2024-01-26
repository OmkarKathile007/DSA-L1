package Recursion;

public class RemoveDuplicatesString {
    public static void RemoveDuplicates(int index,boolean bh[],StringBuilder sb,String str){
        if(index==str.length()){
            System.out.println(sb);
            return;
        }
        // current sum = a   then a-a=0 bh[0]=true;
        char currentsum=str.charAt(index);
        if(bh[currentsum-'a']==true){
            RemoveDuplicates(index+1,bh,sb,str);
        }
        else{
            bh[currentsum-'a']=true;
            RemoveDuplicates(index+1,bh,sb.append(currentsum),str);
        }
    }






    public static void StringDupli(int index,StringBuilder sb ,boolean bh[],String s){
        if (index==s.length()){
            System.out.println(sb);
            return;
        }

        char c=s.charAt(index);
        if (bh[c-'a']==true){
            StringDupli(index+1,sb,bh,s);
        }

        else{
            bh[c-'a']=true;
            StringDupli(index+1,sb.append(c),bh,s);
        }
    }

















    public static void main(String[] args) {
        String str="appnnacollege";
//        RemoveDuplicates(0,new boolean[26],new StringBuilder(),str);

        int  a='e'-'a';
        System.out.println(a);
    }
}
