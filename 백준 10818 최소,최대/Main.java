import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList arrayList = new ArrayList(N);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            arrayList.add(value);
        }

        System.out.print(Collections.min(arrayList));
        System.out.print(" ");
        System.out.print(Collections.max(arrayList));

    }
}
