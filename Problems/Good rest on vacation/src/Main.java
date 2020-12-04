import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int oneNightCost = scanner.nextInt();

        System.out.println(oneWayFlight * 2 + duration * foodCost + (duration - 1) * oneNightCost);
    }
}