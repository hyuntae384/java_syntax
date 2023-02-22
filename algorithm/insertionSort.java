package algorithm;

import java.util.Arrays;

public class insertionSort {
  public static void main(String[] args) {
    int i, j, key;
    int arr[] = {8, 5, 6, 2, 4};

    for(i=1; i<arr.length; i++) {
      key = arr[i];
      for(j=i-1; j>=0 && key < arr[j]; j--){
        arr[j+1] = arr[j];
      }
      arr[j+1] = key; // 두번째 for문에서 마지막에 j-- 가 실행되고 나오므로 j+1 로 해줘야 함.
    }
    System.out.println(Arrays.toString(arr));
  }
}
