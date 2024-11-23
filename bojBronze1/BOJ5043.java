package bojBronze1;

import java.util.Scanner;

public class BOJ5043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int b = sc.nextInt();

        long sum = 1;

        for (int i = 1; i <= b; i++) {
            sum += (1L << i);
        }


        System.out.println(sum >= N ? "yes" : "no");
    }
}
