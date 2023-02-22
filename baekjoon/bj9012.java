package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class bj9012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i=0; i<num; i++) {
      System.out.println(solve(sc.next()));
    }

    sc.close();
  }

  public static String solve(String s) {
    Stack<Character> stack = new Stack<>(); //char형 스택 구현

    for(int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      if(c == '(') {
        stack.push(c);
      } else if(stack.empty()) {
        return "NO";
      } else {
        stack.pop();
      }
    }

    if(stack.empty()) {
      return "YES";
    } else {
      return "NO";
    }
  }
}
