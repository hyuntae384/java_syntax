package baekjoon;

import java.util.Scanner;

public class bj1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    double arr[] = new double[num];
    double M = 0.0;

    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextDouble();
      M = Math.max(M, arr[i]);
    }
    sc.close();
    
    double total = 0.0;
    for(int i=0; i<arr.length; i++) {
      arr[i] = (arr[i] / M) * 100;
      total += arr[i];
    }
    double avg = (double) total / num;

    System.out.println(avg);
  }
}
