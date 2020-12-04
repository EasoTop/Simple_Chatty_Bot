import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (; a <= b; a++) {
            sum += a;
        }

        System.out.println(sum);
    }
}