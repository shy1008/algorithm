import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;
        for (int i = 0; i < n; i++) {
            boolean[] arr = new boolean[26];
            String s = br.readLine();
            arr[(int)s.charAt(0) - 97] = true;
            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == s.charAt(j-1)) continue;

                if (arr[(int)c - 97]) {
                    count--;
                    break;
                }
                arr[(int)c - 97] = true;
            }
        }
        System.out.println(count);
    }
}