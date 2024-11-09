package bojBronze4;

import java.util.Scanner;

public class BOJ2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int time = sc.nextInt();

        // 초 => 분 => 시  이런순으로 계산하면 되기 때문에 그에 맞춰 로직을 짜면될듯?
        // 나눗셈 / 연산 => 몫   % 연산 => 나머지를 나타냄

        s += time;
        if(s>59){
            m+=s/60;
            s=s%60;
        }
        if(m>59){
            h+=m/60;
            m=m%60;
        }
        if (h > 23) {
            h=h%24;
        }
        System.out.println(h+" "+m+" "+s);

    }
}


