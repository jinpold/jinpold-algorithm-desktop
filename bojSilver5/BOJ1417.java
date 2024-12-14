package bojSilver5;

import java.io.*;
import java.util.*;

public class BOJ1417{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int answer = 0;

        if(N!=1){

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for(int i=1;i<N;i++)
                pq.add(Integer.parseInt(br.readLine()));


            while(pq.peek() >= M){
                int cur = pq.poll();
                cur--;
                M++;
                answer++;
                pq.add(cur);
            }
        }
        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
