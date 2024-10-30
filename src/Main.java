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
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
