package ArrayTest;

import java.util.Scanner;

public class BJ10811 {
    public static void main(String[] args) {
        // 바구니 N개 1 ~ N까지의 번호로 지정
        // M번 동안 바구니의 순서를 역순으로 만든다.
        // i, j는 역순으로 만드는 방법
        // i ~ j번째 바구니의 순서를 역순으로 만든다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("바구니 개수");
        int n = scanner.nextInt();
        System.out.println("역순으로 바꿀 횟수");
        int m = scanner.nextInt();

        // 바구니 번호에 대한 배열
        int[] Array = new int[n];

        // 역순이 되도록 저장하기 위한 변수
        int reverse;

        // 바구니 번호 정해주기
        for (int x = 0; x < n; x++) {
            Array[x] = x + 1;
        }

        System.out.println("순서 바꿀 바구니 번호 범위 지정");
        for (int y = 0; y < m; y++) {
            // index를 원래 배열의 index에 맞춰주는 코드
            int i = scanner.nextInt() - 1;  // i = 1 -> 0
            int j = scanner.nextInt() - 1;  // j = 4 -> 3

            while (i < j) {
                reverse = Array[i];
                Array[i] = Array[j];
                Array[j] = reverse;
                i++;
                j--;
            }
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
