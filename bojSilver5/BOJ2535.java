package bojSilver5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ2535 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int index = 0;
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        sb.append(arr[0][0]+" "+arr[0][1]).append("\n");
        sb.append(arr[1][0]+" "+arr[1][1]).append("\n");

        if(arr[0][0] == arr[1][0]) {
            for(int i = 2; i < n; i++) {
                if(arr[1][0] != arr[i][0]) {
                    index = i;
                    break;
                }
            }
            sb.append(arr[index][0]+" "+arr[index][1]).append("\n");
        }
        else sb.append(arr[2][0]+" "+arr[2][1]).append("\n");

        System.out.print(sb);
    }
}
