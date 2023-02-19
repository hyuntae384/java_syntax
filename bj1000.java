import java.util.Scanner;

public class bj1000 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.print(a+b);
    }
  }
}