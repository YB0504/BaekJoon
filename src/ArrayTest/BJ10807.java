package ArrayTest;

import java.util.Scanner;

public class BJ10807 {
    public static void main(String[] args) {
        // N개의 정수에서 특정 정수의 개수 찾기

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 개수");
        int n = scanner.nextInt();

        // n개의 요소를 가진 배열 생성
        int[] arr1 = new int[n];
        // 특정 정수 개수
        int count = 0;

        // 선언한 배열에 정수 추가
        System.out.println("배열에 정수 추가");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += scanner.nextInt();
        }
        
        // 찾아야할 정수 입력
        System.out.println("찾을 정수 입력");
        int x = scanner.nextInt();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == x) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
