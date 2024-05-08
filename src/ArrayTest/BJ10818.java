package ArrayTest;

import java.util.Scanner;

public class BJ10818 {
    public static void main(String[] args) {
        // n개의 정수에서 최소, 최대 값 구하기

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력");
        int n = scanner.nextInt();

        // 배열 선언
        int[] Array = new int[n];

        System.out.println("배열 값");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        // 최대, 최소값을 배열의 0번째 index값으로 초기화
        int max = Array[0];
        int min = Array[0];

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        System.out.print(min+" "+max);
    }
}