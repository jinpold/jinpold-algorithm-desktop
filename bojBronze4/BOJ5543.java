package bojBronze4;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int min1 = Math.min(A,Math.min(B,C));

        int D = sc.nextInt();
        int F = sc.nextInt();
        int min2 = Math.min(D,F);

        System.out.println(min1 + min2 - 50);
    }
}
