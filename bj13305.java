import java.util.Scanner;

public class bj13305 {
  public static void main(String[] args) {
    // 입력값
    Scanner sc = new Scanner(System.in);
    // 거리 입력값을 배열로 저장
    int totalDistance = sc.nextInt();
    // 거리, 기름값을 배열로 저장
    int distance[] = new int[totalDistance];
    int cost[] = new int[totalDistance];

    for(int i=0; i<totalDistance-1; i++){
      distance[i] = sc.nextInt();
    }
    for(int i=0; i<totalDistance; i++) {
      cost[i] = sc.nextInt();
    }
    sc.close();
    // 총 비용 값을 선언
    int sum = 0;
    // 최소 기름값 선언
    int min = cost[0];
    
    // for문(주유소 하나씩 이동)
    for(int i=0; i<totalDistance-1; i++){
      // if(현재 주유소 기름값이 이전 주유소의 기름값보다 쌀 경우)
      if(min > cost[i]) {
        // 최소 기름값 수정
        min = cost[i];
      }
      // 총 비용 = (최소 기름값 * 거리)
      sum += min * distance[i];
    }
    System.out.print(sum);
  }
}
