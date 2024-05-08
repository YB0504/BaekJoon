package forTest;

import java.util.Scanner;

public class BJ2438 {
    public static void main(String[] args) {
        // 왼쪽부터 별찍기
        // N개의 별을 출력하기 위한 숫자 받기
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
