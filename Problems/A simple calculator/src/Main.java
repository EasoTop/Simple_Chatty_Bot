import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        String operator = scanner.next();
        long second = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            case "*":
                System.out.println(first * second);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}