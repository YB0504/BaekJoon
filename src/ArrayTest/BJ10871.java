package ArrayTest;

import java.util.Scanner;

public class BJ10871 {
    public static void main(String[] args) {
        // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
        // X보다 작은 수를 모두 출력하라.

        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 크기 지정");
        int n = scanner.nextInt();
        System.out.println("비교할 정수 입력");
        int x = scanner.nextInt();

        // n만큼의 배열 선언
        int[] a = new int[n];

        // 배열에 들어갈 정수 입력
        // a.length를 사용하면 코드가 통과하지 못하는 이유
        // length는 배열의 길이를 반환하는 속성인데 이 코드에서는
        // 배열의 크기를 입력 받고 있기 때문에 사용자가 입력한 배열과
        // 실제 생성된 배열의 크기가 다를 수 있다.
        System.out.println("배열 채우기");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("배열을 돌며 x와 비교 작은수 출력");
        for (int i = 0; i < n; i++) {
            if (x > a[i]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
