package bojSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ30088 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    int N;
    int M;
    int[] sum;
    long res;

    private void solution() throws IOException {

        N = Integer.parseInt(br.readLine());
        sum = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            for (int j = 0; j < M; j++) {
                sum[i] += Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(sum);
        long prefixSum = 0;
        res = 0;
        for (int i = 0; i < N; i++) {
            prefixSum += sum[i];
            res += prefixSum;
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {

        BOJ30088 main = new BOJ30088();
        main.solution();
    }
}