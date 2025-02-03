package bojSilver5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Arrays;

public class BOJ11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int[] num=new int[n];
        for(int i=0; i<n; i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        for(int i=num.length-1; i>=0; i--){
            bw.write(num[i]+"\n");
        }
        bw.flush();

    }

}