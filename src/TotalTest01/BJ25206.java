package TotalTest01;

import java.util.Scanner;

public class BJ25206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        double totalPoint = 0;

        for (int i = 0; i < 20; i++) {
            String subject = scanner.next();
            double score = scanner.nextDouble();
            String point = scanner.next();

            if (point.equals("A+")) {
                result += score * 4.5;
                totalPoint += score;
            } else if (point.equals("A0")) {
                result += score * 4.0;
                totalPoint += score;
            } else if (point.equals("B+")) {
                result += score * 3.5;
                totalPoint += score;
            } else if (point.equals("B0")) {
                result += score * 3.0;
                totalPoint += score;
            } else if (point.equals("C+")) {
                result += score * 2.5;
                totalPoint += score;
            } else if (point.equals("C0")) {
                result += score * 2.0;
                totalPoint += score;
            } else if (point.equals("D+")) {
                result += score * 1.5;
                totalPoint += score;
            } else if (point.equals("D0")) {
                result += score * 1.0;
                totalPoint += score;
            } else if (point.equals("F")) {
                result += score * 0.0;
                totalPoint += score;
            }
        }

        System.out.println(result/totalPoint);
    }
}
