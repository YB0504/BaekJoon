package ArrayTest;

import java.util.Scanner;

public class BJ10810 {
    public static void main(String[] args) throws Exception {
        // N개의 바구니에 M번 동안 공을 넣는다
        // 각 바구니는 1~N까지 번호가 적혀있고 1~N번 번호를 가지고 있는 공도 있다.
        // 바구니 마다 공은 1개만 들어 가며 이미 들어가 있다면 빼고 다시 넣는다.
        // M번 동안 공을 넣는 방법 = i, j, k
        // i ~ j번의 바구니에 k번이 적힌 공을 넣는다.
        // 최종으로 바구니에 들어간 공의 번호를 출력(공이 없다면 0을 출력)
        Scanner scanner = new Scanner(System.in);

        System.out.println("바구니 개수");
        int n = scanner.nextInt();

        // 바구니 수만큼의 배열 선언
        int[] Array = new int[n];

        System.out.println("공 넣는 횟수");
        int m = scanner.nextInt();

        System.out.println("m만큼의 공넣는 방법 및 공 번호 정하기");
        System.out.println("i ~ j번 까지 바구니에 k번이 적힌 공");
        for (int x = 0; x < m; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            // 바구니의 번호는 1번이 시작이지만
            // 배열의 index는 0부터 이므로 -1을 해서 0을 만든다.
            for (int y = i - 1; y < j; y++) {
                Array[y] = k;
            }
        }
        // 최종적으로 각 바구니에 들어간 공 번호 출력
        for (int z = 0; z < Array.length; z++) {
            System.out.print(Array[z]+" ");
        }
    }
}
