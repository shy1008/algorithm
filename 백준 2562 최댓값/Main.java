import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList();

        int M = 0;
        int Mi = 0;

        for (int i = 0; i < 9; i++) {
            int N = Integer.parseInt(br.readLine());
            arrayList.add(N);


        }
        M = Collections.max(arrayList);

        for (int i = 0; i < 9; i++) {
            if (arrayList.get(i) == M){
                Mi = i + 1;
            }
        }

        System.out.println( M );
        System.out.println( Mi);



    }
}