import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            //4의 배수이면서
            if (year % 100 != 0 || year % 400 == 0) {
                // 100의 배수가 아닐 때 또는 400의 배수일 때
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
