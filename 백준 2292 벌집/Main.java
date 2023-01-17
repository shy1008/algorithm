import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        if (n == 1) {
            count = 1;
        } else {

            while (n > 1) {
                n = n - (6 * count);
                count++;
            }
        }
        System.out.print(count);
    }
}