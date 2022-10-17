import java.util.Scanner;

// 채점 실패 리팩토링 요구
// right index 체크하는 부분에서 의심스러움
// 슬라이딩 윈도우 기법
// 선형탐색이란 ?

public class Main {
    public static int n, x;
    public static int[] arr = new int[250001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i <= x) sum += arr[i];

        }

        int max_sum = sum;
        int count = 1;

        //슬라이딩 윈도우
        int left = 1;
        int right = x;

        while (true) {
            left++;
            right++;

            if (right > n) break;
            sum = sum + arr[right] - arr[left - 1];

//            System.out.println("sum = " + sum);
            if (max_sum == sum) {
                count++;
            } else if (max_sum < sum) {
                max_sum = sum;
                count = 1;
            }
        }

        if (max_sum == 0) {
            System.out.println("SAD");

        } else {
            System.out.println(max_sum);
            System.out.println(count);
        }

    }
}