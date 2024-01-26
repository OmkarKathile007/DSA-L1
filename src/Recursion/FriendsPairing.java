package Recursion;

public class FriendsPairing {
    public static int PairingNum(int n){
        if(n==1 || n==2){
            return n;
        }
        return PairingNum(n-1)+(n-1)*PairingNum(n-2);
    }
    public static void main(String[] args) {
        System.out.println(PairingNum(6));
    }
}
