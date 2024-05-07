package ifTest;

import java.util.Scanner;

public class BJ14681 {
    public static void main(String[] args) {
        // 사분면 고르기
        // A, B의 좌표가 모두 양수면 1
        // A의 좌표가 음수, B의 좌표가 양수면 2
        // A, B의 좌표가 모두 음수면 3
        // A의 좌표가 양수, B의 좌표가 음수면 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("A 좌표");
        int a = scanner.nextInt();
        System.out.println("B 좌표");
        int b = scanner.nextInt();
        scanner.close();

        if (a > 0 && 0 < b) {
            System.out.println("1");
        }
        if (a < 0 && 0 < b) {
            System.out.println("2");
        }
        if (a < 0 && 0 > b) {
            System.out.println("3");
        }
        if (a > 0 && 0 > b) {
            System.out.println("4");
        }
    }
}
