import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int countOfBridges = scanner.nextInt();
        int crush = 0;

        for (int i = 1; i <= countOfBridges; i++) {
            int bridge = scanner.nextInt();

            if (height >= bridge) {
                crush = i;
                break;
            }
        }

        if (crush == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crush);
        }

    }
}