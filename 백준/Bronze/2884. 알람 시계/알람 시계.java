import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] time = new int[2];

        for (int i = 0; i < 2; i++) {
            time[i] = scanner.nextInt();
        }

        int hh = time[0];
        int mm = time[1];

        if(mm < 45){
            if(hh==0){
                hh = 24;
                hh--;
                mm = (60+mm)-45;
            } else {
                hh--;
                mm = (60+mm)-45;
            }
        } else {
            mm -= 45;
        }
        System.out.println(hh + " " + mm);
    }
}
