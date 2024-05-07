package forTest;

import java.util.Scanner;

public class BJ25304 {
    public static void main(String[] args) {
        // 영수증
        // 총 구매 가격과 구매한 물건의 종류가 주어진다.
        // 각 물건의 가격과 구매한 개수를 곱하고 모두 더한 금액이
        // 총 구매 가격과 일치하면 Yes, 일치하지 않으면 No

        Scanner scanner = new Scanner(System.in);

        System.out.println("총 구매 금액");
        int totalPrice = scanner.nextInt();
        System.out.println("구매한 물건 종류");
        int totalProduct = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= totalProduct; i++) {
            System.out.println("물건 금액");
            int price = scanner.nextInt();
            System.out.println("구매한 갯수");
            int product = scanner.nextInt();

            int total = price * product;
            sum += total;
        }
        if (sum == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
