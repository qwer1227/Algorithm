import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 예시
        // 첫 줄 5
        // 두번째 줄 3 1 4 3 2
        // 출력 32
        Scanner sc = new Scanner(System.in);
//        int[] array = {3, 1, 4, 3, 2};
        
        int first = sc.nextInt();
        int[] array = new int[first];

        for (int i = 0; i < first; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int result = 0;

        Arrays.sort(array); // 그리디 알고리즘에 의해서 최선의 해를 찾기위해?

        for (int i : array) {
            sum += i;
            result += sum;
        }

        System.out.println(result);




    }
}