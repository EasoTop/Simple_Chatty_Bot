import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int i = 0;

        do {
            i = scanner.nextInt();
            if (i > 0) {
                count++;
            }
        } while (i != 0);

        System.out.println(count);
    }
}