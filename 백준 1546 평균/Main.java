import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Double M;

        ArrayList<Double> arrayList = new ArrayList();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            double item = Integer.parseInt(st.nextToken());
            arrayList.add(item);
        }

        M = Collections.max(arrayList);

        ArrayList<Double> parseArrayList = new ArrayList();

        for (int i = 0; i < arrayList.size(); i++) {
            double subject = (double) (arrayList.get(i) / M * 100.0);
            parseArrayList.add(subject);
        }

        float sum = 0;
        for (double i :parseArrayList) {
            sum += i;
        }
        float average = sum / parseArrayList.size();

        System.out.println(average);



    }
}