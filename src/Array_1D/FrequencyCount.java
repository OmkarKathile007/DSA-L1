package Array_1D;

public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 6, 2, 6, 6, 3, 6};
        int visit[] = new int[arr.length];
        int visitedlen = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visit[j] = visitedlen;
                }

            }
            if (visit[i] != visitedlen) {
                visit[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (visit[i] != visitedlen) {
                System.out.println(arr[i] + " " + visit[i]);

            }
        }
    }
}
