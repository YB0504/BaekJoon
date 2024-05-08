package ArrayTest;

import java.util.Scanner;

public class BJ2562 {
    public static void main(String[] args) {
        // 9개의 서로 다른 자연수가 주어질 때,
        // 그 중 최대값을 찾고 그 최댓값이 몇 번째 수인지 구하기
        Scanner scanner = new Scanner(System.in);

        // 배열 선언 및 초기화
        // 9개의 값이기 때문에 인덱스는 8까지
        int[] Array = new int[9];

        System.out.println("배열 값 입력");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
        }

        // 최대값 초기화
        int max = Array[0];
        // 최대값의 자리수를 표현할 변수 선언
        int j = 0;

        for (int i = 0; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];
                j = i;
                // j = i + 1; 방식으로 이미 1을 더하면
                // 배열의 인덱스가 0이 아닌 1에서 시작하는 것이 되버린다.
                // 그래서 마지막에 최대값의 자리를 출력할 때
                // 원래 자리보다 1더해진 값이 출력되어 버리게된다.
            }
        }
        System.out.println(max);
        System.out.println(j+1);
    }
}
