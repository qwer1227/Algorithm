import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A, B, V 값 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        // V - A는 올라갈때 걸리는 미터수 , A - B는 하루에 올라가는 미터수
        // /수식결과를 DAYS에 담고 마지막날에 올라가는걸 포함해서 +1시켜준다
        int days = (V - A) / (A - B);  // 기본적으로 V - A까지 올라가는 데 필요한 일수
        if ((V - A) % (A - B) != 0) {
            days++;  // 나머지가 있으면 하루를 추가
        }

        // 마지막 날에 A미터를 한 번에 올라가므로 +1일
        System.out.println(days + 1);  // 마지막 날 포함
    }
}
