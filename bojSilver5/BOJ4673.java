package bojSilver5;

import java.io.*;


public class BOJ4673 {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int num = d(i);
            arr[num] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) sb.append(i + "\n");
        }
        System.out.print(sb);
    }

    static int d(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum <= 10000) return sum;
        return 0;
    }
}