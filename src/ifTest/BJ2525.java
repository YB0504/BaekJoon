package ifTest;

import java.util.Scanner;

public class BJ2525 {
    public static void main(String[] args) {
        // 오븐 시계
        // 2884번과 비슷한 문제이나 입력된 분을 더해야 한다.
        // 시는 0 ~ 23, 분은 0 ~ 59, 23시 59분에서 1분이 지나면 0:0이 된다.

        Scanner scanner = new Scanner(System.in);

        System.out.println("시 입력");
        int h = scanner.nextInt();
        System.out.println("분 입력");
        int m = scanner.nextInt();
        System.out.println("소요시간 입력");
        int t = scanner.nextInt();

        // (분 + 조리시간)을 60으로 나눈게 1이상이라면
        if ((m + t) / 60 >= 1) {
            // (분+조리시간)을 60으로 나눈걸 입력받은 시간에 더한다.
            h = h + ((m + t) / 60);
            // (분+조리시간)%60을 분으로 설정
            m = (m + t) % 60;

            // 위의 코드를 수행했을 때 시간이 23시보다 크다면
            // 24를 뺀다.(하루는 24시간 이므로 0시가 된다.)
            if (h > 23) {
                h = h - 24;
            }
        } else {
            // (분+조리시간)을 60으로 나눈 것이 1이하라면
            // 분+조리시간을 분으로 설정
            m = m + t;
        }

        System.out.println(h + " " + m);
        scanner.close();
    }
}
