package jinPractice;
import java.util.Scanner;

public class Turret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        for (int i = 0; i < testCaseCount; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            System.out.println(calculateIntersections(x1, y1, r1, x2, y2, r2));
        }

        scanner.close();
    }

    private static int calculateIntersections(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            // 두 원이 동일한 경우
            return -1;
        } else if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
            // 두 원이 서로 외부에 있거나 한 원이 다른 원 내부에 있지만 내접하지 않는 경우
            return 0;
        } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
            // 두 원이 외접하거나 내접하는 경우
            return 1;
        } else {
            // 두 원이 두 점에서 만나는 경우
            return 2;
        }
    }
}