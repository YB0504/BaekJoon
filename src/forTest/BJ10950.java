package forTest;

import java.util.Scanner;

public class BJ10950 {
    public static void main(String[] args) {
        // A+B
        // 테스트 케이스의 개수 T
        // 각 테스트 케이스 별로 두 개의 정수가 주어진다.

        Scanner scanner = new Scanner(System.in);

        System.out.println("테스트 케이스 횟수");
        int t = scanner.nextInt();
        int sum = 0;
        System.out.println();

        for (int i = 1; i <= t; i++) {
            System.out.println("정수 입력 A");
            int a = scanner.nextInt();
            System.out.println("정수 입력 B");
            int b = scanner.nextInt();

            sum = a + b;
            System.out.println("sum = "+sum+"\n");
        }
    }
}
