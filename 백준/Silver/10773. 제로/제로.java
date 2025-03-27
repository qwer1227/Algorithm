import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        //다 입력을 받고 0을 찾아서 pop시켜줘야할듯?
        Stack<Integer> arr = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            arr.push(scanner.nextInt());
            if(arr.peek() == 0){
                arr.pop();
                arr.pop();
            }
        }

        for (Integer i : arr) {
            sum+=i;
        }
        
        // i는 2를 가리키는데 당장 다음은 1이라?


        System.out.println(sum);
    }
}
