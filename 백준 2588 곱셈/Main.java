import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        int three = A * Integer.parseInt(String.valueOf(B.charAt(2)));
        int four = A * Integer.parseInt(String.valueOf(B.charAt(1)));
        int five = A * Integer.parseInt(String.valueOf(B.charAt(0)));

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(three + four * 10 + five * 100);

    }
}
