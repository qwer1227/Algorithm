import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int result = A * B * C;
        String resultStr = String.valueOf(result);

        int[] digitCounts = new int[10]; 

        // 결과 문자열을 순회하면서 각 숫자의 등장 횟수를 센다
        for (int i = 0; i < resultStr.length(); i++) {
            int digit = resultStr.charAt(i) - '0'; // char를 int로 변환
            digitCounts[digit]++;
        }

        
        for (int i = 0; i < 10; i++) {
            System.out.println(digitCounts[i]);
        }
    }
}