package bojSilver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ8892 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {

            int K = Integer.parseInt(br.readLine());
            String[] word = new String[K];

            for (int i = 0; i < K; i++)
                word[i] = br.readLine();

            boolean print = true;

            end: for (int i = 0; i < K; i++) {
                for (int j = 0; j < K; j++) {
                    if(i==j) continue;
                    String tmp = word[i] + word[j];
                    boolean flag = true;
                    for (int k = 0; k < tmp.length()/2; k++) {
                        if(tmp.charAt(k) != tmp.charAt(tmp.length()-1-k)) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        str.append(tmp).append("\n");
                        print = false;
                        break end;
                    }
                }
            }
            if(print)
                str.append(0).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}
