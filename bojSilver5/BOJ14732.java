package bojSilver5;

import java.util.Scanner;

public class BOJ14732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] map = new int[501][501];
        int ret = 0;

        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (map[x][y] == 0) {
                        ret++;
                        map[x][y] = 1;
                    }
                }
            }
        }

        System.out.println(ret);
        scanner.close();
    }
}

