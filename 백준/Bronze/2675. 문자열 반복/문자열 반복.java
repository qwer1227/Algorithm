import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            String[] text = S.split("");
            for(int j=0; j < text.length; j++){ //문자바꿀용
                for(int k=0; k < R; k++) { //문자찍을용
                    System.out.print(text[j]);
                }
            }
            System.out.println();
        }
    }
}