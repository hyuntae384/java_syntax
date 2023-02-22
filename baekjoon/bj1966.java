package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.management.Query;

public class bj1966 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int totalCases = Integer.parseInt(br.readLine());

    StringTokenizer st;

    // 각각 케이스를 for문 안에 대입
    for(int i=0; i<totalCases; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int count = Integer.parseInt(st.nextToken());
      int idx = Integer.parseInt(st.nextToken());
      printer(count, idx);
    }
  }

  public static Integer printer(Integer count, Integer idx) {
    // 큐 선언
    Queue<Integer> q = new LinkedList<Integer>();
    // 선언한 후에 테스트 케이스 넣기
  }
}
