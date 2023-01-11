import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'A': case 'B': case 'C':
                    sum = sum + 3;
                    break;
                case 'D': case 'E': case 'F':
                    sum = sum + 4;
                    break;
                case 'G': case 'H': case 'I':
                    sum = sum + 5;
                    break;
                case 'J': case 'K': case 'L':
                    sum = sum + 6;
                    break;
                case 'M': case 'N': case 'O':
                    sum = sum + 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    sum = sum + 8;
                    break;
                case 'T': case 'U': case 'V':
                    sum = sum + 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sum = sum + 10;
                    break;
                default:
                    sum = sum + 0;
                    break;
            }

        }
        System.out.println(sum);

    }
}