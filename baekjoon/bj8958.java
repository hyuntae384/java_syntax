package baekjoon;
import java.util.Scanner;

public class bj8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 첫줄의 숫자를 배열 길이로 설정하여 배열 선언
    String arr[] = new String[sc.nextInt()];

    // 두번째 줄부터 배열에 한 줄씩 저장
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.next();
    }
    sc.close();

    // 저장된 한 줄씩 점수 확인
    for(int i=0; i<arr.length; i++) {
      int cnt = 0;
      int sum = 0;
      // 하나씩 O, X 인지 확인
      for(int j=0; j<arr[i].length(); j++) {
        if(arr[i].charAt(j) == 'O') {
          cnt++;
        } else {
          cnt = 0;
        }
        sum += cnt;
      }
      System.out.println(sum);
    }
  }
}
