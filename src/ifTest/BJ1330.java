package ifTest;

import java.util.Scanner;

public class BJ1330 {
    public static void main(String[] args) {
        // 두 정수 A, B가 주어졌을 때, 비교하는 프로그램을 작성하시오
        // A가 B보다 큰 경우 >
        // A가 B보다 작은 경우 <
        // A가 B보다 동일한 경우 ==

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력");

        System.out.println("a : ");
        int a = scanner.nextInt();
        System.out.println("b : ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        }
        if (a < b) {
            System.out.println("<");
        }
        if (a == b) {
            System.out.println("==");
        }
    }
}
