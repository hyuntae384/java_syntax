package baekjoon;

import java.util.Scanner;

public class bj15649 {

  public static int[] arr;
  public static boolean[] visit;
  public static void main(String[] args) {
    // 수(num)와 길이(len) 입력값을 받는다.
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(); // 수
    int len = sc.nextInt(); // 길이
    sc.close();

    visit = new boolean[num]; //해당 수가 방문 되었는지 확인
    arr = new int[len];

    solve(num, len, 0);
  }

  public static void solve(int num, int len, int depth) {
    if(depth == len) {
      for(int val : arr) {
        System.out.print(val + " ");
      }
      System.out.println();
      return;
    }

    for(int i=0; i<num; i++) {
      if(!visit[i]) {
        visit[i] = true;
        arr[depth] = i+1;
        solve(num, len, depth+1);
        visit[i] = false;
      }
    }
  }

}
