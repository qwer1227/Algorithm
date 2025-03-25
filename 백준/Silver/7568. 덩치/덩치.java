import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[size][2];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String[] parts = scanner.nextLine().split(" ");
            array[i][0] = Integer.parseInt(parts[0]); // x 값
            array[i][1] = Integer.parseInt(parts[1]); // y 값
        }

        for (int i = 0; i < size; i++) {
            int cnt = 0;  // 각 i에 대해 비교할 때마다 cnt 초기화
            for (int j = 0; j < size; j++) {
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
                    cnt++;
                }
            }
            // 결과를 cnt 값에 따라 출력
            result.append(cnt + 1).append(" ");
        }

        System.out.println(result.toString());

    }
}