import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        String lang;

        switch (answer) {
            case 1:
                lang = "Yes!";
                break;
            case 2:
            case 3:
            case 4:
                lang = "No!";
                break;
            default:
                lang = "Unknown number";
                break;
        }

        System.out.println(lang);
    }
}