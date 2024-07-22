import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String[] word = new String[number];
        for(int i=0; i<number; i++){
            word[i] = sc.nextLine();
        }

        Arrays.sort(word, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(word[0]);

        for(int i=1; i < number; i++){
            if(!word[i].equals(word[i-1])){
                System.out.println(word[i]);
            }
        }
    }
}