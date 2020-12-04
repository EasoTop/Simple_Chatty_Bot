import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();

        int i = 1;
        long fact = 1;

        while (fact <= number) {
            i++;
            fact *= i;
        }

        System.out.println(i);
    }
}