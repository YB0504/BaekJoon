package TotalTest01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = n;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            int prev = 0;

            int[] alphabet = new int[26];

            for (int j = 0; j < s.length(); j++) {
                int now = s.charAt(j);

                if (prev != now) {
                    if (alphabet[now - 97] == 0) {
                        alphabet[now - 97]++;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
