import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int direction = scanner.nextInt();

        String move = null;

        switch (direction) {
            case 0:
                move = "do not move";
                break;
            case 1:
                move = "move up";
                break;
            case 2:
                move = "move down";
                break;
            case 3:
                move = "move left";
                break;
            case 4:
                move = "move right";
                break;
            default:
                move = "error!";
                break;
        }

        System.out.println(move);
    }
}