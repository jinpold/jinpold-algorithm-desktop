package bojSilver5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ5648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberReverser numberReverser = new NumberReverser();

        int n = sc.nextInt();


        List<Long> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            long num = sc.nextLong();

            list.add(numberReverser.reverseNumber(num));
        }

        Collections.sort(list);

        for (long num : list) {
            System.out.println(num);
        }
    }
}

class NumberReverser {

    public long reverseNumber(long num) {

        long reversed = 0;

        while (num > 0) {

            reversed = reversed * 10 + num % 10;

            num /= 10;
        }

        return reversed;
    }
}
