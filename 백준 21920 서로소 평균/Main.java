import java.util.Scanner;

//최대 공약수를 구하는 방법의 유클리드호제법 알고리즘 기억하기 !
//절대 오차와 상대오차에 대한 개념
//평균 구하는 방법
public class Main {
    public static int n,x;

    public static int[] arr = new int[500000];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        x = sc.nextInt();

        long sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (gcd(x, arr[i]) == 1) {
                sum += arr[i];
                count++;
            }
        }

        System.out.printf("%.6f", (double) sum / count);

    }

    //유클리드 호제법
    public static long gcd(long x, long y){
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

}