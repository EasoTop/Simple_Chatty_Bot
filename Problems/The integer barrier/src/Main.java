import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();

            sum += number;

            if (number == 0) {
                System.out.println(sum);
                break;
            }

            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}