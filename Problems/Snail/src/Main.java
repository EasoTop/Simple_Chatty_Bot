import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        int days = (height - 1 - down) / (up - down) + 1;

        System.out.println(days);
    }
}