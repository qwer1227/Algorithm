import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        while (true) {
            int maxIdx = 1;
            int maxVal = -1;

            for (int i = 1; i < N; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIdx = i;
                }
            }


            if (arr[0] > maxVal) break;

            arr[0]++;
            arr[maxIdx]--;
            result++;
        }

        System.out.println(result);
    }
}
