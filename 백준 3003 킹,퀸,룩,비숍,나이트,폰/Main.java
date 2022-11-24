import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = 1;
        int queen = 1;
        int look = 2;
        int bishops = 2;
        int night = 2;
        int pawns = 8;

        int k = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.print((king - k) + " " + (queen - q) + " " + (look - l) + " " + (bishops - b) + " " +(night - n) + " " + (pawns - p));


    }
}
