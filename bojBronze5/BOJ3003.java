package bojBronze5;

import java.util.Scanner;
public class BOJ3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1, 1, 2, 2, 2, 8};
        for(int i=0; i<6; i++){
            int temp = sc.nextInt();
            int result = A[i] - temp;
            System.out.print(result+" ");
        }
    }
}
