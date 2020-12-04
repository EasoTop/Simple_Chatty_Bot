import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float m = scanner.nextInt();
        float p = scanner.nextInt();
        float k = scanner.nextInt();

        int year = 0;

        while (m < k) {
            m += m * p / 100;
            year++;
        }

        System.out.println(year);
    }
}