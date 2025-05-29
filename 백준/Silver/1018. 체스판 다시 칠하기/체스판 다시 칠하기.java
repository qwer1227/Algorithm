import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] matrix = new char[n][m];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            matrix[i] = sc.next().toCharArray();
        }

        for (int i = 0; i <=  n-8; i++) { // x의 시작점을 가리키는 i , n-8을 하는 이유는 8x8체스판을 그려야 하기 때문에 최대로 갈 수 있는 거리를 계산하기 위함
            for (int j = 0; j <=  m-8; j++) { // y의 시작점을 가리키는 j , m-8을 하는 이유는 8x8체스판을 그려야 하기 때문에 최대로 갈 수 있는 거리를 계산하기 위함
                int a = 0; // 흰색일때 증가시킬 변수
                int b = 0; // 블랙일때 증가시킬 변수
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        char current = matrix[i + k][j + l]; // 좌표가 늘어남에 따라 현재 체스판의 위치를 바꾸는 용도
                        if ((k + l) % 2 == 0) { // 첫 시작이 흑인지 백인지 상관없이 로직이 진행할 수 있게 만들어줌
                            if (current != 'W') a++; // 현재 좌표에서 값이 w면 a++
                            if (current != 'B') b++; // 현재 좌표에서 값이 b면 b++
                        } else {
                            if (current != 'B') a++;
                            if (current != 'W') b++;
                        }
                    }
                }
                    result.add(Math.min(a, b));
                }

            }

        System.out.println(Collections.min(result));
    }
}