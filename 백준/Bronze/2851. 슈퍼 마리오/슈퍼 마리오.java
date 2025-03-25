import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[10];

        int result = 0;
        int sum = 0;

        for(int i=0; i < values.length; i++){

            values[i] = sc.nextInt();
         }

        //값을 저장을 시켜서 두개의 값중에 작은 순간일때?

        for(int i=0; i<values.length; i++){
            result += values[i];
            if(result == 100){
                sum = result;
                break;

            } else if(result > 100){
                if (Math.abs(result - 100) <= Math.abs(sum - 100)){
                    sum = result;
                }
                break;
            } else {
                sum = result;
            }
        }
        System.out.println(sum);
    }
}