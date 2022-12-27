import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[] arr ;
        double score;

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            score = 0;

            for (int j = 0; j < N; j++) {
                int sub = Integer.parseInt(st.nextToken());
                arr[j] = sub;
                score += sub;
            }

            double mean = score / N ;
            double count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > mean){
                    count ++;
                }
            }
            System.out.println(String.format("%.3f%%", (count/arr.length)*100));
        }

    }
}