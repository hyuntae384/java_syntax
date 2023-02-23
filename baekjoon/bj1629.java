package baekjoon;

import java.util.Scanner;

// 모듈러 합동 공식에 대해서 알고 있어야 함
public class bj1629 {
  public static void main(String[] args) {
    // A^B%C
    // A, B, C를 출력받는다.
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();

    sc.close();

    
  }

  public static long mul(long a, long b, long c) {
    if(b == 1) {
      return a % c;
    }
    long temp = mul(a, b/2, c);

    if(b % 2 == 1) {
      return (temp * temp % c) * a % c;
    }
    return temp * temp % c;
  }
}