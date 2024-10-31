public class Main {
    /// Sieves of Erastothenes
    public static void Tprimes{
        int N=1000001;

        boolean[] arr = new boolean[N];

        for (int i = 2; i * i < N; i++) {
            if (!arr[i]) {
                for (int j = i * i; j < N; j += i) {
                    arr[j] = true;
                }
            }
        }

        Set<Long> res = new HashSet<>();
        for (int i = 2; i < N; i++) {
            if (!arr[i]) {
                res.add((long) i * i);
            }
        }

    }
    // gcd using iterative approach
     public static int gcd(int a,int b){

        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }

        return a;
    }

    // gcd using recursive 
    public static int gcd1(int a,int b){

       if(b==0) return a;

        return gcd1(b,a%b);
    }
//    public static final int MOD=100005;

    public static final int MOD = 1000000007; // Set MOD to your desired modulus
  /// Binary Exponentiaition using Recursive
    public static int BinaryExpo(int a, int b) {
        int temp = 1;
        if (b == 0) {
            return 1;
        }
        temp = BinaryExpo(a, b / 2);
        temp %= MOD;
        temp *= temp;
        temp %= MOD;
        if ((b & 1) == 1) { // if b is odd
            temp *= a;
            temp %= MOD; // fix here
        }
        return temp;
    }
  //// Binary Exponentiation using Iterative Approach
     public static int BinaryExpo1(int a,int b){
        int res=1;
        while(b>0){
            if((b&1)==1){
                res=(res * a)%MOD;
            }
            b=b>>1;
            a=(a*a)%MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
