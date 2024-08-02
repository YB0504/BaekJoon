package StringTest;

import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 숫자를 정수가 아닌 문자로 받는다.
        String s = scanner.next();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            // charAt() 반환한 문자의 아스키 코드 값을
            // 숫자 그대로 사용하기 위해 -'0'을 해준다.
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
