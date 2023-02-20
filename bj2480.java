import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2480 {
  public static void main(String[] args) throws IOException{
    // 입력값 분리하여 저장
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int a, b, c;
    a = Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    // if문으로 조건에 따라 분리

    if(a == b && b == c) {
      System.out.println(10000 + a * 1000);
    }
    else if(a != b && b != c && c != a) {
      System.out.println(Math.max(Math.max(a, b), c) * 100);
    }
    else if(a == b || a == c){
      System.out.print(1000 + a * 100);
    }
    else {
      System.out.print(1000 + b * 100);
    }
  }
}
