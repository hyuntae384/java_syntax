import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj1931 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    // int time[][] = 이중 배열로 시간 저장
    int time[][] = new int[num][2];
    StringTokenizer st;
    
    // for문 통해서 time에 값 저장
    for(int i=0; i<num; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      time[i][0] = Integer.parseInt(st.nextToken());
      time[i][1] = Integer.parseInt(st.nextToken());
    }

    // 종료시간 기준으로 정렬한다
    // 2차원 배열 정렬 방법 이해하기
    Arrays.sort(time, new Comparator<int[]>() {
      @Override
        public int compare(int[] o1, int[] o2) {
          // 기본적으로는 종료값인 [1]을 기준으로 오름차순 정렬

          // [1]이 같은 경우
          if(o1[1] == o2[1]){
            // [0]을 오름차순 정렬
            return o1[0] - o2[0];
          }
          // [1]이 다른 경우 오름차순 정렬
          return o1[1] - o2[1];
        }
    });

    int finished = 0; // 종료시간
    int meeting = 0; // 회의 누적 횟수

    // for(0~num)
    for(int i=0; i<num; i++) {
      // 시작시간과 finished 비교
      if(time[i][0] >= finished){
        // 시작시간이 더 클경우 finshed에 해당 배열의 종료시간 저장 & meeting++
        finished = time[i][1];
        meeting++;
      }
      // 아니면 그냥 넘어감
    }
    System.out.print(meeting);
  }
}
