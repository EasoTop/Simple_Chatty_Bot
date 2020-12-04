import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shape = scanner.nextInt();
        String choose;

        switch (shape) {
            case 1:
                choose = "You have chosen a square";
                break;
            case 2:
                choose = "You have chosen a circle";
                break;
            case 3:
                choose = "You have chosen a triangle";
                break;
            case 4:
                choose = "You have chosen a rhombus";
                break;
            default:
                choose = "There is no such shape!";
                break;
        }

        System.out.println(choose);
    }
}