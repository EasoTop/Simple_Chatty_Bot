import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String house = scanner.nextLine();
        String houseMeans = null;

        switch (house) {
            case "gryffindor":
                houseMeans = "bravery";
                break;
            case "hufflepuff":
                houseMeans = "loyalty";
                break;
            case "slytherin":
                houseMeans = "cunning";
                break;
            case "ravenclaw":
                houseMeans = "intellect";
                break;
            default:
                houseMeans = "not a valid house";
                break;
        }

        System.out.println(houseMeans);
    }
}