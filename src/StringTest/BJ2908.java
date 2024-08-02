package StringTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(a > b ? a : b);
    }
}
