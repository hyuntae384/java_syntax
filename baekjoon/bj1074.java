package baekjoon;

import java.util.Scanner;

public class bj1074 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int square = sc.nextInt();
    int row = sc.nextInt();
    int column = sc.nextInt();

    sc.close();

    // 각각 행과 열을 비교하여 몇 사분면인지 확인하기
    // 몇 사분면에 위치했는지 half 값으로 파악
    // 해당 사분면으로 이동 후에 행렬값 가공
    System.out.print(z(square, row, column));
  }

  public static int z(int square, int row, int column) {
    if(square == 1) {
      if(row == 0 && column == 0) return 0;
      if(row == 0 && column == 1) return 1;
      if(row == 1 && column == 0) return 2;
      if(row == 1 && column == 1) return 3;
    }

    int half = 2^(square-1);
    if(row < half && column < half) { // 1사분면
      return z(square-1, row, column);
    } 
    
    else if(row < half && column >= half) { // 2사분면
      return half * half + z(square-1, row, column-half);
    } 
    
    else if(row >= half && column < half) { // 3사분면
      return half * half * 2 + z(square-1, row-half, column);
    } 
    
    else { // 4사분면
      return half * half * 3 + z(square-1, row-half, column-half);
    }
  }
}
