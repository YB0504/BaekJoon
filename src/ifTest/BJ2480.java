package ifTest;

import java.util.Scanner;

public class BJ2480 {
    public static void main(String[] args) {
        // 주사위 세개
        // 같은 눈이 3개 나오면 10,000+(같은 눈)*1,000
        // 같은 눈 2개 1,000+(같은 눈)*100
        // 모두 다른 눈 (가장 큰 눈)*100

        Scanner scanner = new Scanner(System.in);

        System.out.println("주사위 굴리기 1!");
        int dice1 = scanner.nextInt();
        System.out.println("주사위 굴리기 2!");
        int dice2 = scanner.nextInt();
        System.out.println("주사위 굴리기 3!");
        int dice3 = scanner.nextInt();

        int price = 0;

        if (dice1 == dice2 && dice2 == dice3) {
            price = 10000 + (dice1) * 1000;
            System.out.println(price);
        } else if (dice1 == dice2 || dice2 == dice3) {
            price = 1000 + (dice2) * 100;
            System.out.println(price);
        } else if (dice1 == dice3) {
            price = 1000 + (dice1) * 100;
            System.out.println(price);
        } else {
            int maxDice = (dice1 > dice2) ? dice1 : ((dice2 > dice3) ? dice2 : dice3);
            price = maxDice * 100;
            System.out.println(price);
        }
    }
}
