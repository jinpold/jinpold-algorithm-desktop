package bojSilver5;

import java.util.*;


public class BOJ14490 {
    static int N, number;
    static int A[];

    void InputData() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String s[] = str.split(":");
        A = new int[2];
        for (int i=0; i<2; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
    }

    int GCD(int a, int b) {
        if (b%a == 0) return a;
        else return GCD(b%a, a);
    }

    void Solve() {
        int num = 0;
        num = GCD(A[0], A[1]);
        System.out.println(A[0]/num+":"+A[1]/num);
    }

    public static void main(String[] args) {
        BOJ14490 m = new BOJ14490();
        m.InputData();
        m.Solve();
    }
}
