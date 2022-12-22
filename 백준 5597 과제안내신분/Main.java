import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 31; i++) {
            arrayList.add(i);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 28; i++) {
            int N = Integer.parseInt(br.readLine());

            arrayList.remove(Integer.valueOf(N));
        }

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

    }
}