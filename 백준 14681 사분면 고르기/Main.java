import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                // 둘다 양수 이므로, 1사분면
                System.out.println("1");

            } else if (y < 0) {
                // x는 양수 y는 음수, 4사분면
                System.out.println("4");

            }
        } else if (x < 0) {
            if (y > 0) {
                // x는 음수 y는 양수, 2사분면
                System.out.println("2");

            } else if (y < 0) {
                // 둘다 음수 이므로, 3사분면
                System.out.println("3");

            }
        }
    }
}
