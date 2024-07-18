import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int index=0;
        int sum=0;
        for(int i=0; i<number; i++) {
            String text = br.readLine();
            String[] tokens = text.split("");
            index =0;
            for(int j=0; j < tokens.length; j++) {
                if (tokens[j].equals("O")) {
                    index++;
                    sum += index;
                }  else if (tokens[j].equals("X")) {
                    index = 0;
                }
            }
            System.out.println(sum);
            sum=0;
        }

    }
}