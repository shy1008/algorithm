import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 등차수열에 관한 개념
// 키워드 공차
// 문제파악 - 각 자리가 등차수열을 이룬다!
// int형 변수에서 각 자리숫자를 알수있는 방법
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(count(N));
    }

    static int count(int n) {
        int a;
        int b;
        int c;

        int count = 0;

        if (n == 1000){
            count--;
        }

        for (int i = 1; i <= n; i++) {

            if (i < 100){
                count ++;
            } else {
                a = i % 10; // 1의 자리숫자
                b = (i / 10) % 10; // 10의 자리숫자
                c = (i / 100) % 10; // 100의 자리숫자

                // b-a == c-b 공차 비교
                if (b-a == c-b){
//                    System.out.println("카운트값은? = "  + i);
                    count++;
                }
            }
        }

        return count;
    }

}