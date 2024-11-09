package bojBronze4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2752_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer []A = new Integer[3];
        A[0]=sc.nextInt();
        A[1]=sc.nextInt();
        A[2]=sc.nextInt();
        Arrays.sort(A, Collections.reverseOrder()); //오름차순을 내림차순으로 출력
        System.out.println(A[0]+ " "+A[1]+" "+A[2]);
    }
}

