package bojBronze5;

import java.util.Scanner;
public class BOJ11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A+B;
            System.out.println("Case #"+i+": "+sum);
        }
    }
}
