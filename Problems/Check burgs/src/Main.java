import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if (str.length() >= 4) {
            System.out.println(str.substring(str.length() - 4).equalsIgnoreCase("burg"));
        } else {
            System.out.println(false);
        }

    }
}