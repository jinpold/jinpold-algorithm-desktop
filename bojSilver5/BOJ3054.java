package bojSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3054 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] outputStrArr = {"", "", "", "", ""};

        int cnt = 1;
        char symbol = '#';
        char[] charArr = br.readLine().toCharArray();
        final int charArrLen = charArr.length;
        for (char c : charArr) {

            char prevSymbol = '*';
            if (cnt % 3 == 0) {
                symbol = '*';
                cnt = 1;
            } else {
                if (symbol != '*') {
                    prevSymbol = '#';
                }
                symbol = '#';
                cnt++;
            }

            outputStrArr[0] += ".." + symbol + ".";
            outputStrArr[1] += "." + symbol + "." + symbol;
            outputStrArr[2] += prevSymbol + "." + c + ".";
            outputStrArr[3] += "." + symbol + "." + symbol;
            outputStrArr[4] += ".." + symbol + ".";
        }

        if (charArrLen > 0) {
            outputStrArr[0] += ".";
            outputStrArr[1] += ".";
            outputStrArr[2] += symbol;
            outputStrArr[3] += ".";
            outputStrArr[4] += ".";

            for (String line : outputStrArr) {
                System.out.println(line);
            }
        }

    }
}
