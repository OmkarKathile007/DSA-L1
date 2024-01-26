package Strings;

public class P3_CompareLargest_n_Substring {
    public static String Substring(String str,int st,int ei){
        String st1="";
     for (int i=st;i<ei;i++){
         st1+=str.charAt(i);
     }
     return st1;
    }
    public static void main(String[] args) {
        String str[]={"Apple","mango","Banana"};
        String largest = str[0];
        for (int i=1;i<str.length;i++){
            if ((largest.compareTo(str[i]))<0){
                largest=str[i];
            }
        }
        System.out.println(largest);


        // CompareTo compare the String on the basis of Unicode Value (lexicographically)
//
//        String st1="Omkar";
//        String st2="Kathile";
//        System.out.println(st1.compareTo(st2));
//
//        System.out.println(Substring("Omkar",2,5));
    }
}
