package Strings;

public class P7_LowerCase_Count {
    public static void main(String[] args) {
        String str=new String("Omkar");
        String str2=str.toUpperCase();

        int start=0;
        int count=0;
        int end=str.length()-1;
        while(start<=end){
            if (str.charAt(start)!=str2.charAt(start)){
                System.out.print(str.charAt(start));
                count++;
            }
            start++;
        }
        System.out.println("Number of LowerCase"+count);


    }
}
