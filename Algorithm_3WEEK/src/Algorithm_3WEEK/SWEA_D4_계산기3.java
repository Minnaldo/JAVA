package Algorithm_3WEEK;

import java.util.Scanner;
import java.util.Stack;
 
public class SWEA_D4_계산기3 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
 
        Scanner s = new Scanner(System.in);
        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            int num = s.nextInt();
            String expr = s.next();
            for (int i = 0; i < expr.length(); i++) {
                char c = expr.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else if (c == '(') {
                    stack.push(c);
                } else if (c == '+') {
                    while (!stack.empty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                } else if (c == '*') {
                    while (!stack.empty() && stack.peek() != '+' && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.push(c);
                } else if (c == ')') {
                    char top = stack.pop();
                    while (!stack.empty() && top != '(') {
                        sb.append(top);
                        top = stack.pop();
                    }
                }
            }
 
            while (!stack.empty())
                sb.append(stack.pop());
 
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
 
                if (Character.isDigit(c)) {
                    stack2.push(c - '0');
                }
 
                else if (c == '+' || c == '-' || c == '*' || c == '/') {
                    int num2 = stack2.pop();
                    int num1 = stack2.pop();
                    if (c == '+')
                        stack2.push(num1 + num2);
                    else if (c == '-')
                        stack2.push(num1 - num2);
                    else if (c == '*')
                        stack2.push(num1 * num2);
                    else if (c == '/')
                        stack2.push(num1 / num2);
                }
            }
 
            System.out.println("#" + tc + " " + stack2.pop());
        }
    }
}