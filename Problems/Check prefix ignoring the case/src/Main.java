import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(str.toUpperCase().charAt(0) == 'J');
    }
}