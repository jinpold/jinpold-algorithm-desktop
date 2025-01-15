package bojSilver5;

import java.util.*;

public class BOJ3280 {
    static int N, D;
    static Queue<Pair> que = new LinkedList<>();
    static Pair[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        N = sc.nextInt();
        N /= 3;


        for (int i = 0; i < N; i++) {
            que.add(new Pair(3 * i + 1, true));
            que.add(new Pair(3 * i + 2, true));
            que.add(new Pair(3 * i + 3, true));
        }


        D = sc.nextInt();
        arr = new Pair[N][3];


        while (D-- > 0) {

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < 3; c++) {
                    arr[r][c] = que.poll();
                }
            }


            sc.nextLine();
            String s = sc.nextLine();
            if (!s.equals("first")) {
                for (int r = 0; r < N; r++) arr[r][0].second = false;
            }
            if (!s.equals("second")) {
                for (int r = 0; r < N; r++) arr[r][1].second = false;
            }
            if (!s.equals("third")) {
                for (int r = 0; r < N; r++) arr[r][2].second = false;
            }


            for (int c = 0; c < 3; c++) {
                for (int r = 0; r < N; r++) {
                    que.add(arr[r][c]);
                }
            }
        }


        List<Integer> result = new ArrayList<>();
        while (!que.isEmpty()) {
            Pair front = que.poll();
            if (front.second) result.add(front.first);
        }


        for (int i = 0; i < result.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result.get(i));
        }
    }


    static class Pair {
        int first;
        boolean second;

        Pair(int first, boolean second) {
            this.first = first;
            this.second = second;
        }
    }
}
