import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        int reA = (A.charAt(2)-'0')*100 + (A.charAt(1)-'0')*10 + (A.charAt(0)-'0');
        int reB = (B.charAt(2)-'0')*100 + (B.charAt(1)-'0')*10 + (B.charAt(0)-'0');

        if(reA > reB)
            System.out.println(reA);
        else
            System.out.println(reB);
    }

}