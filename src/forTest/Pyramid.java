package forTest;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        // 피라미드 모양 별찍기

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
