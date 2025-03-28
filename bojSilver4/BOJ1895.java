package bojSilver4;

import java.util.*;
public class BOJ1895 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] dp = new int[9];
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int x = scan.nextInt();
        int g = (n-2) * (m-2);
        int[] ans = new int[g];
        int count = 0;
        int sh = 0;
        for(int i = 0; i < n-2; i++){
            count = 0;
            for(int j = 0; j < m-2; j++){
                dp[count] = arr[i][j];
                dp[count+1] = arr[i][j+1];
                dp[count+2] = arr[i][j+2];
                dp[count+3] = arr[i+1][j];
                dp[count+4] = arr[i+1][j+1];
                dp[count+5] = arr[i+1][j+2];
                dp[count+6] = arr[i+2][j];
                dp[count+7] = arr[i+2][j+1];
                dp[count+8] = arr[i+2][j+2];
                Arrays.sort(dp);
                ans[sh] = dp[4];
                sh++;
            }
        }
        int a = 0;
        for(int i = 0; i < sh; i++){
            if(ans[i] >= x)
                a++;
        }
        System.out.println(a);

    }
}
