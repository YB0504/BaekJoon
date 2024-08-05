package TotalTest01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int index = 0;

        for (int i = 0; i < croatianAlphabet.length; i++) {
            index = s.indexOf(croatianAlphabet[i]);
            if (index >= 0) {
                s = s.replaceAll(croatianAlphabet[i], "A");
            }
        }
        System.out.println(s.length());
    }
}
