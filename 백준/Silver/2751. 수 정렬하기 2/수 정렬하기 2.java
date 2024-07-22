import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];

        for(int i=0; i < count; i++){ // 0 1 2 3 4
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        int[] newArr = Arrays.stream(numbers).distinct().toArray();
        for(int i = 0; i < numbers.length; i++){
            bw.write(newArr[i]+"\n");
        }
        bw.close();
    }
}