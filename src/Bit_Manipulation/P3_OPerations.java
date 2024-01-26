package Bit_Manipulation;

public class P3_OPerations {
    public static int Get_ith_Shift(int n , int i){
        int bitMask=1<<i;
        if ((n & bitMask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int Set_ith_Bit(int n,int i){
        return n | 1<<i;
    }
    public static int clearithbit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;

    }
    public static void main(String[] args) {
//        System.out.println(Get_ith_Shift(15,3));
//        System.out.println(Set_ith_Bit(9,4));
        System.out.println(clearithbit(10,12));
    }
}
