package bojBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24389 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int inputNum = Integer.parseInt(br.readLine());


        int outputNum = ~inputNum + 1;


        int sameBitNum = inputNum ^ outputNum;

        int count = 0;
        for (char ch : Integer.toBinaryString(sameBitNum).toCharArray()){
            if(ch == '1'){
                count++;
            }
        }


        System.out.print(count);

    }
}
