package forTest;

import java.util.Scanner;

public class BJ2739 {
    public static void main(String[] args) {
        // 구구단

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력");
        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
