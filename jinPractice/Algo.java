package jinPractice;

import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt(); // 학생 수
            int[] scores = new int[N];
            int sum = 0;

            for (int j = 0; j < N; j++) {
                scores[j] = sc.nextInt(); // 점수 입력
                sum += scores[j];
            }

            double average = (double) sum / N;
            int count = 0;

            for (int score : scores) {
                if (score > average) {
                    count++;
                }
            }

            double percentage = 100.0 * count / N;
            System.out.printf("%.3f%%\n", percentage);
        }
        sc.close();
    }
}