import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int large = 0;
        int number;

        do {
            number = scanner.nextInt();
            large = Math.max(number, large);
        } while (number != 0);

        System.out.println(large);
    }
}