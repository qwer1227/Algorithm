import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] result = new int[10];

        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            result[i] = num[i] % 42;
        }
        int[] newArr = Arrays.stream(result).distinct().toArray();
        System.out.println(newArr.length);
    }
}