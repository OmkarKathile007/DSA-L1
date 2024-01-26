package Strings;

public class P1_Reverse_Pallindrome {
    public static void Reverse(String st){
        String str2="";
        for (int i=st.length()-1;i>=0;i--){
            str2=str2+st.charAt(i);
        }
        System.out.println(str2);
    }

    public static boolean IsPallindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(0) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Reverse("OMKAR");
        boolean br=IsPallindrome("Omkar");


    }
}
