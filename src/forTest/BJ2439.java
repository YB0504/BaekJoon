package forTest;

import java.util.Scanner;

public class BJ2439 {
    public static void main(String[] args) {
        // 오른쪽부터 별 찍기

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // 입력받은 숫자에서 i를 뺀만큼 반복하며 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
