package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class bj10799 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String brackets = sc.next();
    sc.close();

    Stack<Character> stack = new Stack<>();

    int piece = 0;
    
    for(int i=0; i<brackets.length(); i++) {
      if(brackets.charAt(i) == '(') {
        stack.add(brackets.charAt(i));  
      } else {
        stack.pop();
        if(brackets.charAt(i-1) == '(') {
          piece += stack.size();
        } else {
          piece += 1;
        }
      }
    }
    System.out.println(piece);
  }
}
