import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<String> list = new LinkedList<String>();



        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            if (arr[0].equals("push")) {
                list.add(arr[1]);
            } else if (arr[0].equals("pop")) {
                bw.write(list.isEmpty() ? "-1\n" : list.poll()+ "\n");
            } else if (arr[0].equals("size")) {
                bw.write(list.size() + "\n");
            } else if (arr[0].equals("empty")) {
                bw.write(list.isEmpty() ? "1\n" : "0\n");
            } else if (arr[0].equals("front")) {
                bw.write(list.isEmpty() ? "-1\n" : list.peek()+"\n");
            } else if (arr[0].equals("back")) {
                bw.write(list.isEmpty() ? "-1\n" : ((LinkedList<String>) list).getLast() + "\n");
            }
            bw.flush();
        }

        bw.close();
    }
}

