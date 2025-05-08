import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<>();

        boolean flag = false;

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size() > 1) {
            if (!flag) { // flag가 false면 맨앞에꺼 지우고 true면 맨앞에걸 뒤로
                q.remove(q.peek());
                flag = true;
            } else {
                q.add(q.peek());
                q.remove(q.peek());
                flag = false;
            }
        }
        System.out.println(q.peek());
    }
}

