import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int item = Integer.parseInt(st.nextToken());
            arr[i] = item;
        }

        int v = Integer.parseInt(br.readLine());

        for (int i:arr) {
            if (i == v){
                count ++;
            }
        }

//        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
}
