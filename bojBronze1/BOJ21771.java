package bojBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21771 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        st.nextToken();

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        st.nextToken();
        int answer = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

        while(r --> 0) {
            for(char ch : br.readLine().toCharArray()) {
                if(ch == 'P') {
                    answer--;
                }
            }
        }
        System.out.print(answer != 0 ? 1 : 0);
    }
}
