package bojBronze5;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //아스키 코드 기준으로 대문자에서 32을 더하면 소문자가 된다. ex) A 65 / a 97
        char []text = sc.nextLine().toCharArray();
        for(int i=0; i<text.length; i++){
            char temp = text[i];
            if(temp >= 'a' && temp <= 'z'){ // temp가 소문자일때
                System.out.print((char)(temp-32)); //소문자인 경우, (char) = int를 다시 char로 변경
            }else{
                System.out.print((char)(temp+32)); //대문자인 경우
            }
        }
    }
}
