package ArrayTest;

import java.util.Scanner;

public class BJ5597 {
    public static void main(String[] args) {
        // 30명의 학생, 출석 번호는 1 ~ 30번
        // 과제 제출한 사람은 28명이고 제출 안 한 2명의 출석번호를 구하기
        Scanner scanner = new Scanner(System.in);

        // 총 학생 수가 30명 이지만 1부터 반복해야하기 때문에 31의 배열을 선언
        int[] Array = new int[31];


        // 과제 제출한 학생의 출석 번호 입력
        for (int i = 1; i <= 28; i++) {
            Array[scanner.nextInt()]++;
        }

        // 출석 번호 전체와 0을 반복하며 비교하여
        // 과제 제출을 하지 않은 학생의 값은 0이기 떄문에
        // 0이 저장 되어 있는 학생이 출력 된다.
        for (int j = 1; j <= 30; j++) {
            if (Array[j] == 0) {
                System.out.println(j);
            }
        }
        scanner.close();
    }
}
