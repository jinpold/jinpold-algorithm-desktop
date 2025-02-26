package bojSilver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ1331 {
    public static int nowx, nowy, prevx, prevy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> visit = new ArrayList<String>();
        String st = br.readLine();

        int startx = st.charAt(0);
        int starty = st.charAt(1);
        prevx = startx;
        prevy = starty;

        visit.add(st);


        for(int i = 0; i < 35; i++) {
            String s = br.readLine();
            nowx = s.charAt(0);
            nowy = s.charAt(1);

            if(visit.contains(s)) {
                System.out.println("Invalid");
                return;
            }

            if(Math.abs(nowx - prevx) == 2 && Math.abs(nowy - prevy) == 1 || Math.abs(nowx - prevx) == 1 && Math.abs(nowy - prevy) == 2) {    // 나이트가 이전 위치에서 이동할 수 있는 위치가 아니면 Invalid

            }else {
                System.out.println("Invalid");
                return;
            }

            visit.add(s);
            prevx = nowx;
            prevy = nowy;
        }

        if(Math.abs(nowx - startx) == 2 && Math.abs(nowy - starty) == 1 || Math.abs(nowx - startx) == 1 && Math.abs(nowy - starty) == 2) {

        }else {
            System.out.println("Invalid");
            return;
        }


        System.out.println("Valid");
    }

}
