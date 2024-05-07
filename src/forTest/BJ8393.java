package forTest;

import java.util.Scanner;

public class BJ8393 {
    public static void main(String[] args) {
        // 정수 n이 주어졌을 때 1 ~ n까지의 합

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력");
        int n = scanner.nextInt();
        int sum= 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum : " + sum);
    }
}
