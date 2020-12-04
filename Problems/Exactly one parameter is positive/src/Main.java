import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean first = a > 0 && b <= 0 && c <= 0;
        boolean second = a <= 0 && b > 0 && c <= 0;
        boolean third = a <= 0 && b <= 0 && c > 0;

        boolean oncePositive = first || second || third;

        System.out.println(oncePositive);
    }
}