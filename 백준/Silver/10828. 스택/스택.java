import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> arr = new Stack<>();

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String s = br.readLine();
            String[] num = s.split(" ");

            if (s.contains("push")) {
                arr.push(Integer.parseInt(num[1]));
            } else if (s.contains("pop")) {
                if (arr.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(arr.pop() + "\n");
                }
            } else if (s.contains("size")) {
                bw.write(arr.size() + "\n");
            } else if (s.contains("top")) {
                if (arr.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(arr.peek() + "\n");
                }
            } else if (s.contains("empty")) {
                if (arr.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
            bw.flush();
        }

        bw.close();

    }
}
