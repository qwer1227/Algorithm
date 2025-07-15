import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] temp = new int[41];
        temp[0] = 1;
        temp[1] = 1;
        temp[2] = 2;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("1 0");
            } else if (n == 1) {
                System.out.println("0 1");
            } else if (n == 2) {
                System.out.println("1 1");
            } else {
                for (int j = 3; j < n; j++) {
                    temp[j] = temp[j - 1] + temp[j - 2];
                }
                System.out.println(temp[n - 2] + " " + temp[n - 1]);
            }
        }
    }
}