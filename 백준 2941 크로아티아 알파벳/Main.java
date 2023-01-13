import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for(String val : arr) {
            s = s.replace(val, "0");
        }
        System.out.println(s.length());
    }
}