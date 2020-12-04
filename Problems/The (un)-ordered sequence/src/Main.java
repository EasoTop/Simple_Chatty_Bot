import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean changeOrder = false;
        int ordered = 0;
        int current = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                if (changeOrder) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
                break;
            }

            if (current == 0) {
                current = number;
            } else {
                if (number > current) {
                    if (ordered == 0) {
                        ordered = 1;
                    } else if (ordered == -1) {
                        changeOrder = true;
                    }
                } else if (number < current) {
                    if (ordered == 0) {
                        ordered = -1;
                    } else if (ordered == 1) {
                        changeOrder = true;
                    }
                }
                current = number;
            }
        }
    }
}