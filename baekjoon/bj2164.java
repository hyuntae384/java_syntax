package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj2164 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //카드 개수 선언
    int num = Integer.parseInt(br.readLine());

    // int arr[] = new int[num];
    Queue<Integer> q = new LinkedList<Integer>();

    // 카드를 배열로 변경
    for(int i=1; i<=num; i++) {
      q.add(i);
    }


    // 제일 위에 카드 제거, 그 다음 제일 위에 카드 아래로 이동
    while(q.size() > 1) {
      q.poll();
      int next = q.poll();
      q.add(next);
    }

    System.out.println(q.poll());
  }
}
