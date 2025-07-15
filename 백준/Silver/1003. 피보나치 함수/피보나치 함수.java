import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] temp = new int[41][2];
        temp[0][0] = 1;
        temp[0][1] = 0;

        temp[1][0] = 0;
        temp[1][1] = 1;

        for (int i = 2; i <= 40; i++) { //값을 할당하는 반복문 2부터 시작
            temp[i][0] = temp[i - 1][0] + temp[i - 2][0]; // [2][0] >> n이 2일때 0이 몇번 나왔는지 구하는 
            temp[i][1] = temp[i - 1][1] + temp[i - 2][1]; // [2][1] >> n이 2일때 1이 몇번 나왔는지 구하는
        }

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(temp[n][0] + " " + temp[n][1]); //0을 호출, 1을 호출한횟수
        }

    }
}