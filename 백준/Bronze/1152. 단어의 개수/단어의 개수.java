import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        text = text.trim();

        String[] count = text.split(" ");
        if (text.isBlank()) {
            System.out.println("0");
        } else {
            System.out.println(count.length);
        }

    }
}