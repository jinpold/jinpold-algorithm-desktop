package bojSilver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ20949 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Monitor> monitors = new ArrayList<>();

        int count = Integer.parseInt(br.readLine());
        for(int i = 1; i <= count; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(stz.nextToken());
            int height = Integer.parseInt(stz.nextToken());
            monitors.add(new Monitor(i, width, height));
        }
        monitors.sort((monitor1, monitor2) ->
                monitor1.calculatedValue == monitor2.calculatedValue ?
                        monitor1.number - monitor2.number : monitor2.calculatedValue - monitor1.calculatedValue);

        StringBuilder answer = new StringBuilder();
        for(Monitor monitor : monitors) {
            answer.append(monitor.number).append("\n");
        }

        System.out.println(answer.toString());
    }

    static class Monitor {
        int number, calculatedValue;

        Monitor(int _number, int width, int height) {
            number = _number;
            calculatedValue = calculate(width, height);
        }

        private int calculate(int width, int height) {
            return (int) (Math.pow(width, 2) + Math.pow(height, 2));
        }

    }
}
