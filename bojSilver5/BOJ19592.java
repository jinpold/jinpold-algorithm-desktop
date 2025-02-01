package bojSilver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ19592 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        new BOJ19592().solution();
    }

    private void solution() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);

            int vArray[] = new int[n];
            input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                vArray[j] = Integer.parseInt(input[j]);
            }


            double min = Double.MAX_VALUE;
            for (int j = 0; j < n - 1; j++) {

                min = Math.min(min, 1.0 * x / vArray[j]);
            }


            if (min > 1.0 * x / vArray[n - 1]) {
                bw.write(0 + "\n");
            } else {

                int start = 0;
                int end = y;

                while (start <= end) {
                    int mid = (start + end) / 2;


                    if (min > ((1.0 * x - mid) / vArray[n - 1]) + 1) {
                        end = mid - 1;
                    }

                    else {
                        start = mid + 1;
                    }
                }

                if (start > y) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(start + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}