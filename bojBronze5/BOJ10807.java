package bojBronze5;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[201]; //입력범위 200개 + 0 인덱스 = 201
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int index = sc.nextInt(); //입력으로 주어지는 정수와 V는 -100보다 크거나 같고, 100보다 작거나 같음
            A[index+100]++; //입력받은 값을 값이 아니라 인덱스 위치에 저장
                            //100을 더해주는 이유는 음수 값이 입력되었을 때 정수로 표현하기 위함(인덱스는 음수가 올 수 없으므로)
            System.out.println("인덱스 ::: " + A[index+100]);
        }
        int V = sc.nextInt(); //
        System.out.println(A[V+100]);
    }
}
