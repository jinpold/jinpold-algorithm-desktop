package bojSilver4;

import java.io.*;
import java.util.*;

public class BOJ1544 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            String tmp1 = list.get(i);
            for (int j = i + 1; j < N; j++) {
                if (tmp1.length() == list.get(j).length()) {
                    String tmp2 = list.get(j) + list.get(j);
                    if (tmp2.contains(tmp1)) {
                        list.remove(j);
                        N--;
                        j--;
                    }
                }
            }
        }
        System.out.println(N);

        bw.flush();
        bw.close();
        br.close();
    }
}
