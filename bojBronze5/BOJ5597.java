package bojBronze5;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check[] = new int[31]; //30번까지 넣어야함. (check 0으로 초기화)

        for(int i=0; i<28; i++) {
            int number = sc.nextInt(); //출석 넘버
            check[number]++; // 인덱스가 초기화 된 상태에서 예제를 입력하면 number는
                             // 0이 아닌 상태 즉, 출석을 한 상태가 된다.
        }
        for(int i=1; i<=30; i++) // 출석은 1번부터 오름차순으로 출력(for문이 자연스럽게 오름차순 정렬)
            if(check[i]==0) System.out.println(i);
    }
}
