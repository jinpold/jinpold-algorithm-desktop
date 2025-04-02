package bojSilver4;

import java.util.*;
import java.io.*;

public class BOJ2840 {

    static int N;
    static int K;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        char[] arr = new char[N];
        for(int i =0; i < N; i++) {
            arr[i] = '?';
        }
        int currentIndex =0;
        for(int i =0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int step = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);
            int nextIndex = ((currentIndex - step) % N +N) % N;
            if(arr[nextIndex] == '?') {
                arr[nextIndex] = ch;
            }
            else if(arr[nextIndex] != ch) {
                System.out.println("!");
                return;
            }
            currentIndex = nextIndex;
        }

        boolean[] chk = new boolean[26];
        for (int i = 0; i < N; i++) {
            if (arr[i] == '?') continue;
            if (chk[arr[i] - 'A']) {
                System.out.println("!");
                return ;
            }
            chk[arr[i] - 'A'] = true;
        }
        for(int i =0; i < N; i++) {
            System.out.print(arr[(currentIndex + i) % N]);
        }
        System.out.println();
    }
}