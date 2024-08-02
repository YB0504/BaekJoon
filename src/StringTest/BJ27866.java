package StringTest;

import java.util.Scanner;

public class BJ27866 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int i = scanner.nextInt() - 1;  // charAt()은 0번째 부터 시작한다.

        System.out.println(s.charAt(i));
        scanner.close();
    }
}
