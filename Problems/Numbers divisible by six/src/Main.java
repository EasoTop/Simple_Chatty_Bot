import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int elem = scanner.nextInt();
            if (elem % 6 == 0) {
                sum += elem;
            }
        }

        System.out.println(sum);
    }
}