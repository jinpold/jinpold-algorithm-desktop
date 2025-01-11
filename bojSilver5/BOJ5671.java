package bojSilver5;

import java.util.*;
public class BOJ5671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int sum = 0;
            while (N <= M) {
                String number = Integer.toString(N);
                int score = 0;
                for (int i = 0; i < number.length() - 1; i++) {
                    for (int j = i + 1; j < number.length(); j++) {
                        if (number.charAt(i) == number.charAt(j)) {
                            score++;
                            break;
                        }
                    }
                }
                if (score == 0)
                    sum++;
                N++;
            }
            System.out.println(sum);
        }
    }
}
