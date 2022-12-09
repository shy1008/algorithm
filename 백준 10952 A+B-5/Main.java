import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader 와 BufferedWriter를 사용해보자.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;

            if (A == 0 && B == 0) {
                break;
            }

            bw.write(sum +"\n");
        }
        bw.flush();
        bw.close();
    }
}
