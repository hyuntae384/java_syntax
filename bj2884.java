import java.util.Scanner;

public class bj2884 {
  public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
      int hour = sc.nextInt();
      int minute = sc.nextInt();

      if(minute >= 45) {
        minute = minute - 45;
      }
      else if(hour != 0) {
        hour = hour - 1;
        minute = 60 - (45 - minute);
      }
      else {
        hour = 23;
        minute = 60 - (45 - minute);
      }

      System.out.println(hour + " " + minute);
    }
  }
}
