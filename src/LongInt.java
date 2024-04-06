import java.util.Scanner;

public class LongInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n/4;

        for (int i = 0; i < m; i++) {
            System.out.println("long");
        }
        System.out.println("int");
    }
}
