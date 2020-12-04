import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    int maxElement = 0;

      for (int i = 1; i <= count; i++) {
          int elem = scanner.nextInt();
          if (elem % 4 == 0 && elem > maxElement) {
        maxElement = elem;
      }
    }

    System.out.println(maxElement);
  }
}