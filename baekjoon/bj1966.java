package baekjoon;

// 인덱스와 짝지어 큐에 넣는다.
// 큐에 아무 데이터가 남지 않을 때까지 반복
  // 하나씩 꺼내어 front로 넣는다.
  // 큐의 나머지 값들과 비교해 front보다 큰 값이 나올때까지 반복한다. (if문에 한 번도 들어가지 않으면 최대값인 것이다.)
    // 큰 값이 나오면 front를 큐 맨 뒤로 보낸다.
    // 해당 큰값 이전 값까지 순서대로 큐 맨 뒤로 보낸다
    // for문을 끝낸다
  // 최대값 여부 확인 : 최대값이 아니면 다시 반복문(4)으로 간다.
  // count 값 +1 (몇 번째로 출력되었는지 확인하기 위한 변수)
  // 현재 인덱스가 찾는 인덱스값과 같으면 반복문 종료
// count 출력


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj1966 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int totalCases = Integer.parseInt(br.readLine());

    while (totalCases-- > 0) {
      // 4 2 
      // 1 2 3 4 로 주어진 것으로 가정 
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int num = Integer.parseInt(st.nextToken()); // 4
      int idx = Integer.parseInt(st.nextToken()); // 2

      LinkedList<int[]> q = new LinkedList<>();
      st = new StringTokenizer(br.readLine(), " ");

      for(int i=0; i<num; i++) {
        q.offer(new int[] {i, Integer.parseInt(st.nextToken())}); // {{0,1}, {1,2}, {2,3}, {3,4}}
      }

      int count = 0;

      while(!q.isEmpty()) { // 큐에 아무 데이터가 남지 않을 때까지 반복
          int[] front = q.poll(); // 큐 안에 맨 앞의 리스트를 빼서 front 라는 배열에 선언 : 처음에는 {0,1}
          boolean isMax = true;
            
          for(int i=0; i<q.size(); i++) { // front보다 큰 값이 나올 때까지 for문을 돌림
              if(front[1] < q.get(i)[1]) { 
                  // 뽑아진 리스트와 큐 안의 데이터 값을 비교 (get함수는 LinkedList로 선언시 가능, Queue는 안됨)
                  q.offer(front); // 최대값이 아니므로 다시 큐로 넣는다.

                  for(int j=0; j<i; j++){ // 
                      // 이부분을 반복하려면 i는 1 이상이어야 함 -> for(39)에서 다음단계(i=1일 경우)로 넘어갈 수 있어야 함
                      // if(40)문에서 false가 나와야 한다 -> front 다음 값이 더 작아야 한다.
                      q.offer(q.poll());
                  }

                  isMax = false;
                  break; // i값 변동 없이 for(39) 종료 => 53으로 이동
              }
              
          }

          if(isMax == false) { 
              continue;
          }
          
          // 더이상 front보다 큰 값이 없다는 뜻이다.
          count++;
          
          if(front[0] == idx) {
              break;
          }
      }

      sb.append(count).append('\n');

    }

    System.out.println(sb);
  }
}
