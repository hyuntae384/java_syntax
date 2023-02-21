import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj4344 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] scores;
    int num = Integer.parseInt(br.readLine());

    StringTokenizer st;

    for(int i=0; i<num; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int scoreCount = Integer.parseInt(st.nextToken());
      scores = new int[scoreCount];
      double sum = 0;

      for(int j=0; j<scoreCount; j++) {
        int score = Integer.parseInt(st.nextToken());
        scores[j] = score;
        sum += score;
      }

      double avg = sum / scoreCount;
      double overAvgCount = 0;

      for(int k=0; k<scoreCount; k++) {
        if(scores[k] > avg){
          overAvgCount++;
        }
      }

      double ratio = overAvgCount / scoreCount * 100 ;

      System.out.printf("%.3f%%\n", ratio);
    }
  }
}
