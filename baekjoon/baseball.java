package baekjoon;

// 배열 [23, 24, 55, 34, 56, 74, 32, 45, 12] % 5 => 9점
// 배열 [31, 24, 25, 4, 52, 12, 34, 75, 96, 65, 54, 34] % 5 => 6점
// 나머지에 따라 안타가 정해짐
// 1: 1루타, 2: 2루타, 3: 3루타 , 4: 홈런, 0: 아웃,
// 3아웃 또는 배열 종료시 게임 종료
// 최종 점수 출력
//

// 큐 사용해서 해보기
public interface baseball {
  public static void main(String[] args) {
    int arr[] = {31,24,14,52,32,34,75,96,54,34};

    int out = 0;
    int score = 0;
    int base[] = {0, 0, 0};

    for(int i=0; i<arr.length; i++) {
      switch(arr[i] % 5) {
        case 0: // 아웃
          out++;
        case 1: // 1루타
          for(int j=2; j>=0; j--) {
            if(j == 2) {
              if(base[j]==1) {
                score++;
                base[j] = 0;
              }
            } else {
              if(base[j] == 1) {
                base[j+1] = 1;
                base[j] = 0;
              }
            }
          }
          base[0] = 1;
          break;

        case 2: // 2루타
          for(int j=2; j>=0; j--) {
            if(j>=1) {
              if(base[j] == 1) {
                score++;
                base[j] = 0;
              }
            } else {
              if(base[j] == 1) {
                base[j+2] = 1;
                base[j] = 0;
              }
            }
          }
          base[1] = 1;
          break;

        case 3: // 3루타
          for(int j=2; j>=0; j--) {
            if(base[j] == 1) {
              score++;
              base[j] = 0;
            }
          }
          base[2] = 1;
          break;
          
        case 4: // 홈런
          for(int j=2; j>=0; j--) {
            if(base[j] == 1) {
              score++;
              base[j] = 0;
            }
          }
          score++;
          break;
      }

      if(out == 3) {
        break;
      }
    }

    System.out.print(score);
  }
}
