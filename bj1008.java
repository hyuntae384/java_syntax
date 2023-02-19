import java.util.Scanner;

public class bj1008 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      double a = scanner.nextInt();
      double b = scanner.nextInt();

      System.out.print(a/b);
    }
  }
}