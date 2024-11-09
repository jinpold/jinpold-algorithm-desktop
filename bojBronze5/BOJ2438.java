package bojBronze5;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){ //N번의 반복이 일어나야함.
            for (int j =0; j<i; j++){// 1번, 2번, 3번 순차적으로
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
