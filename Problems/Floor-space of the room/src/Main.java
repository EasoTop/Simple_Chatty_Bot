import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = 0;
        String type = scanner.nextLine();

        double a;
        double b;
        double c;
        double r;

        switch (type) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();

                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                area = a * b;
                break;
            case "circle":
                r = scanner.nextInt();
                area = 3.14 * Math.pow(r, 2);
                break;
            default:
                break;
        }

        System.out.println(area);
    }
}