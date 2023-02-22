package algorithm;

import java.util.Arrays;

public class selectionSort {
  public static void main(String[] args) {
    int[] arr = {9, 6, 7, 3, 5};

    for(int i=0; i<arr.length; i++) {
      int minidx = i;
      for(int j=i+1; j<arr.length; j++) {
        if(arr[minidx] > arr[j]) {
          minidx = j;
        }
      }
      int temp = arr[minidx];
      arr[minidx] = arr[i];
      arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
