package bojBronze4;

import java.util.Scanner;

public class BOJ3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //R1+R2 = S*2
        //R2 = S*2 - R1
        int R1 = sc.nextInt();
        int S = sc.nextInt();
        System.out.println(S*2-R1);
    }
}
