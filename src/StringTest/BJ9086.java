package StringTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ9086 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
        }
    }
}
