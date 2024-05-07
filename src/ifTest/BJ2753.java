package ifTest;

import java.util.Scanner;

public class BJ2753 {
    public static void main(String[] args) {
        // 운년 구하기
        // 윤년이면 1, 아니면 0을 출력
        // 윤년은 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때

        Scanner scanner = new Scanner(System.in);

        System.out.println("연도 입력");
        int year = scanner.nextInt();
        scanner.close();

        if ((year % 4 == 0 && year % 400 == 0) || year % 100 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
