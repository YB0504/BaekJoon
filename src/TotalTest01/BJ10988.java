package TotalTest01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ10988 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();

        StringBuilder sb = new StringBuilder(s1).reverse();

        if (s1.equals(sb.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
