import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedReader 와 BufferedWriter를 사용해보자.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int N = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+ b;
            bw.write( sum +"\n");
        }
        bw.flush();
        bw.close();
    }
}
