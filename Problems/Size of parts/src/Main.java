import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 1; i <= n; i++) {
            int detail = scanner.nextInt();
            if (detail == -1) {
                smaller++;
            } else if (detail == 1) {
                larger++;
            } else if (detail == 0) {
                perfect++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}