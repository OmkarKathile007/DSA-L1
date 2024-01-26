package Recursion;

public class P14_Length0fString {
    public static int StringLength(String st,int i){
        if(i==st.length()){
            return i;
        }
        return StringLength(st,i+1);
    }

    public static void main(String[] args) {
        System.out.println("Length of String"+StringLength("Omkar",0));
    }
}
