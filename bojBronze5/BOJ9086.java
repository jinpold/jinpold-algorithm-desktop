package bojBronze5;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //디버깅 결과 nextInt()로 할 시 for문에서 스트링 값으로 바로 전환되지 않아서  Integer.parseInt로 감싸줌.
        int num = Integer.parseInt(sc.nextLine());
        for (int i=0; i<num; i++) {
            String text = sc.nextLine();
            String sum = text.substring(0,1)+
                         text.substring(text.length()-1);
            System.out.println(sum);
        }
    }
}
