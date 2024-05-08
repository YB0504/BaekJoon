package forTest;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        // 거꾸로 피라미드

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");

        int n = scanner.nextInt();

        // i가 1이 될때까지 반복
        for (int i = n; i >= 1; i--) {
            // 첫 줄에는 공백이 없어야 하기 때문에
            // n에서 i를 빼준만큼 공백 처리(처음엔 n=i이다.)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 정방향 피라미드와 같은 방식으로 *을 출력하면 된다.
            // 피라미드 모양이 되려면 홀수가 되야 한다.
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
