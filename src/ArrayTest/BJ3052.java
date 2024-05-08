package ArrayTest;

import java.util.Scanner;

public class BJ3052 {
    public static void main(String[] args) {
        // 자연수 A, B
        // 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구하고
        // 그 나머지가 서로 다른 값이 몇 개 있는지 구하기
        Scanner scanner = new Scanner(System.in);

        // 배열 선언
        int[] Array = new int[10];
        // 나머지 동일 여부를 판단할 변수
        boolean b1;
        // 서로 다른 나머지가 있을 때 개수를 count할 변수
        int count = 0;

        System.out.println("선언한 배열에 숫자를 추가하면서 42로 나눈 나머지 저장");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt() % 42;
        }
        for (int j = 0; j < Array.length; j++) {
            b1 = false;
            for (int k = j + 1; k < Array.length; k++) {
                if (Array[j] == Array[k]) {
                    b1 = true;
                    break;
                }
            }
            if (b1 == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
