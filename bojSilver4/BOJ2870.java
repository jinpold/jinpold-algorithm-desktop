package bojSilver4;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BOJ2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        List<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            StringBuilder sb = new StringBuilder();
            boolean isSeq = false;

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (Character.isDigit(c)) {
                    sb.append(c);
                    isSeq = true;
                } else if (Character.isLetter(c)) {
                    isSeq = false;
                }

                if (!isSeq && !sb.toString().equals("")) {
                    list.add(new BigInteger(sb.toString()));
                    sb = new StringBuilder();
                }


                if (j == input.length() - 1 && !sb.toString().equals("")) {
                    list.add(new BigInteger(sb.toString()));
                }
            }
        }

        Collections.sort(list);
        for (BigInteger i : list) {
            bw.write(i + "\n");
        }

        bw.flush();
    }
}
