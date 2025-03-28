import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] number = br.readLine().split(" ");
        int begin = Integer.parseInt(number[0]);
        int end = Integer.parseInt(number[1]);
        int[] sosu = new int[end+1];

        // 3 부터 16까지 3,4,5,6,7,8,9,10,11,12,13,14,15,16을 넣음
        for(int i=2; i<=end; i++){
            sosu[i]=i;
        }

        // 2부터 16까지 돌아갈 포문
        for(int i=2; i<=end; i++){
            if(sosu[i]==0){
                continue;
            }


            // 자기자신을 제외한 수이기때문에 4부터시작 처음은 2의배수 다 제거 , 3의 배수 다 제거 ,,,
            for(int j=i+i; j<=end; j=j+i){
                sosu[j] = 0;
            }
        }
        
        // begin 부터 end까지 3~16 null이 아니라면 출력
        for(int i=begin; i<=end; i++){
            if(sosu[i]!=0){
                System.out.println(sosu[i]);
            }
        }



        bw.flush();
        bw.close();
    }
}

