package bojBronze4;

import java.util.Scanner;

public class BOJ5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            String name = sc.next();
            System.out.println(name.toLowerCase());

        }
    }
}
