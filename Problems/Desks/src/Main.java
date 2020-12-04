import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int desc1 = number1 / 2 + number1 % 2;
        int desc2 = number2 / 2 + number2 % 2;
        int desc3 = number3 / 2 + number3 % 2;

        System.out.println(desc1 + desc2 + desc3);
    }
}