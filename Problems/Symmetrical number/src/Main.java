import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if (i / 1000 == i % 10 && i % 1000 / 100 == i % 100 / 10) {
            System.out.println(1);
        } else {
            System.out.println(18);
        }
    }
}