package bojSilver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ3699 {
    static int T;
    static int h, l;
    static int[][] parkingBuilding = new int[50][50];
    static int[] tempFloor = new int[50];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());

            for (int j = 0; j < h; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < l; k++) {
                    parkingBuilding[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(solution()).append("\n");
        }
        System.out.print(sb);
    }

    static int solution() {
        int curNum = 1;
        int answer = 0;

        while (true) {
            boolean isFound = false;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < l; j++) {
                    if (curNum == parkingBuilding[i][j]) {
                        answer += i * 2 * 10;
                        isFound = true;


                        if (j <= l / 2) {
                            answer += j * 5;
                        } else {
                            answer += (l - j) * 5;
                        }


                        for (int k = 0; k < l; k++) {
                            tempFloor[(k + l - j) % l] = parkingBuilding[i][k];
                        }
                        for (int k = 0; k < l; k++) {
                            parkingBuilding[i][k] = tempFloor[k];
                        }
                    }
                }
                if (isFound) break;
            }

            if (!isFound) break;
            curNum++;
        }

        return answer;
    }
}
