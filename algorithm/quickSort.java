package algorithm;

import java.util.Arrays;

public class quickSort {
  public static void main(String[] args) {
    int arr[] = {3, 7, 5, 8, 1, 6, 9, 10, 2, 4};
    quick_sort(arr, 0, 9);
    System.out.print(Arrays.toString(arr));
  }

  public static void quick_sort(int[] arr, int start, int end) {
    if(start >= end) {
      return;
    }
    int pivot = start;
    int left = start + 1;
    int right = end;

    while(left <= right) {
      while(left <= end && arr[left] <= arr[pivot]) {
        left++;
      }
      while(right > start && arr[right] >= arr[pivot]) {
        right--;
      }
      if(left > right) swap(arr[right], arr[pivot]);
      else swap(arr[right], arr[left]);
    }
    quick_sort(arr, 0, right-1);
    quick_sort(arr, right+1, end);
  }

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
}
