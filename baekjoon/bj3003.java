package baekjoon;
import java.util.Scanner;

public class bj3003 {
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
      int king = scanner.nextInt();
      int queen = scanner.nextInt();
      int look = scanner.nextInt();
      int bishop = scanner.nextInt();
      int knight = scanner.nextInt();
      int pon = scanner.nextInt();

      System.out.println(1-king);
      System.out.println(1-queen);
      System.out.println(2-look);
      System.out.println(2-bishop);
      System.out.println(2-knight);
      System.out.println(8-pon);
    }
  }
}