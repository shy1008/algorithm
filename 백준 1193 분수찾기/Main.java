import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int sum = 0;
        int cross = 1;

        while (true){
            if (X <= cross + sum){
                if ( cross % 2 == 1){
                    //홀수줄
                    System.out.print((cross - (X - sum - 1)) + "/" + (X - sum));
                    break;
                }else {
                    //짝수줄
                    System.out.print((X - sum) + "/" + (cross - (X - sum - 1)));
                    break;
                }
            }else {
                sum += cross;
                cross ++;
            }
        }
    }
}