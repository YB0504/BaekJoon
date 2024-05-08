package ArrayTest;

import java.util.Scanner;

public class BJ10813 {
    public static void main(String[] args) {
        // 바구니 N개, 1 ~ N번까지 번호가 매겨져 있고, 같은 번호의 공이 들어가 있다.
        // M번 동안 공을 바꾼다. 두 개의 바구니를 선택하고 서로 교환
        // i, j는 i번, j번 바구니를 서로 교환한다는 뜻

        Scanner scanner = new Scanner(System.in);

        System.out.println("바구니 개수");
        int n = scanner.nextInt();

        System.out.println("공 교환 횟수");
        int m = scanner.nextInt();

        // 바구니에 해당하는 배열 선언
        int[] Array = new int[n];

        // 공의 번호를 저장할 변수 선언
        int ball;

        // 바구니 번호에 맞는 공의 설정
        for (int i = 0; i < n; i++) {
            Array[i] = i + 1;
        }

        System.out.println("공을 교환할 바구니 번호 선택");
        for (int x = 0; x < m; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            ball = Array[i - 1];
            Array[i - 1] = Array[j - 1];
            Array[j - 1] = ball;
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
