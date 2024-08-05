package TotalTest01;

import java.util.Scanner;

public class BJ3003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] piece = new int[6];

        for (int i = 0; i < chess.length; i++) {
            piece[i] += scanner.nextInt();
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - piece[i]+" ");
        }
    }
}
