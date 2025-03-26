import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = scanner.nextLine().split("");

        if(n == array.length){
            int[] result = new int[array.length];
            int a = 0;

            for (int i = 0; i < array.length; i++) {
                result[i] = Integer.parseInt(array[i]);
                a += result[i];
            }
            System.out.println(a);
        }
    }
}
