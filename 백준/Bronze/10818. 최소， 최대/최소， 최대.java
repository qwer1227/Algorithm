import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();

        String[] n = scanner.nextLine().split(" ");

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(n[i]);
        }

        Arrays.sort(numbers);

        System.out.println(numbers[0] + " " + numbers[size-1]);

    }
}
