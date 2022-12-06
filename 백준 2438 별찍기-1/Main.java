import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader 와 BufferedWriter를 사용하자
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}


//    StringTokenizer st = new StringTokenizer(bf.readLine());
//    int a = Integer.parseInt(st.nextToken());
//    int b = Integer.parseInt(st.nextToken());
//    int c = a + b;