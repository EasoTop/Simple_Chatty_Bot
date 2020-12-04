import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean weekendCups = cups >= 15 && cups <= 25 && weekend;
        boolean nonWeekendCups = cups >= 10 && cups <= 20 && !weekend;
        System.out.println(weekendCups || nonWeekendCups);
    }
}