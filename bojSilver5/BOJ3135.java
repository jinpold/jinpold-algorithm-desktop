package bojSilver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3135 {
    static int a;
    static int b;
    static int n;
    static int min;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(br.readLine());

        min = Math.abs(a - b);


        for (int i = 0; i < n; i++) {

            int favorite = Integer.parseInt(br.readLine());


            min = Math.min(Math.abs(b - favorite) + 1, min);
        }


        System.out.println(min);
    }
}
