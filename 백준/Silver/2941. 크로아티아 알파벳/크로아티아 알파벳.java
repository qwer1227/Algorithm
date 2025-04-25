import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = br.readLine().split("");

        int idx = 0;
        int result = 0;

        //c가 있으면 다음번지수에 =or-가 있는지?
        //d가 있고 다음번지수에 z가 있고 다음 번지수에 = 이 있는지?
        //d가 있고 다음번지수에 -가 있는지?
        //l이 있고 다음번지수에 j가 있는지?
        //n이 있고 다음번지수에 j가 있는지?
        //s가 있고 다음번지수에 =이 있는지?
        //z가 있고 다음번지수에 =가 있는지?

        while (idx < word.length) {
            if (idx + 1 < word.length && word[idx].equals("c") &&
                    (word[idx + 1].equals("=") || word[idx + 1].equals("-"))) {
                result++;
                idx += 2;
            } else if (idx + 2 < word.length && word[idx].equals("d") &&
                    word[idx + 1].equals("z") && word[idx + 2].equals("=")) {
                result++;
                idx += 3;
            } else if (idx + 1 < word.length && word[idx].equals("d") &&
                    word[idx + 1].equals("-")) {
                result++;
                idx += 2;
            } else if (idx + 1 < word.length && word[idx].equals("l") &&
                    word[idx + 1].equals("j")) {
                result++;
                idx += 2;
            } else if (idx + 1 < word.length && word[idx].equals("n") &&
                    word[idx + 1].equals("j")) {
                result++;
                idx += 2;
            } else if (idx + 1 < word.length && word[idx].equals("s") &&
                    word[idx + 1].equals("=")) {
                result++;
                idx += 2;
            } else if (idx + 1 < word.length && word[idx].equals("z") &&
                    word[idx + 1].equals("=")) {
                result++;
                idx += 2;
            } else {
                result++;
                idx++;
            }
        }

        System.out.println(result);
    }
}

