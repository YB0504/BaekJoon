package ifTest;

import java.util.Scanner;

public class BJ2884 {
    public static void main(String[] args) {
        // 알람시간 45분 일찍 맞추기
        // 시간 H, 분 M이 주어진다.
        // 하루의 시작은 0:0, 끝은 23:59

        Scanner scanner = new Scanner(System.in);

        System.out.println("시간 입력");
        int h = scanner.nextInt();
        System.out.println("분 입력");
        int m = scanner.nextInt();
        scanner.close();

        // 분이 45분보다 빠르면
        if (m < 45) {
            // 시간을 한시간 뺀다.
            h--;
            m = 60 - (45 - m);

            // 분이 45분보다 빠른데 시간이 0시라면
            // 시간은 23시가 된다.
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            // 시간이 45분보다 늦으면 입력된 분에서 45분을 뺀다.
            System.out.println(h + " " + (m - 45));
        }
    }
}
