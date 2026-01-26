package 알고리즘_기초.자료구조;

import java.io.*;
import java.util.*;

/**
 * 백준 10828번 문제
 * */
public class 스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령의 수 N

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.startsWith("push")) {
                // 정수 X를 추출하여 스택에 push
                int value = Integer.parseInt(input.split(" ")[1]);
                stack.push(value);
            } else if (input.equals("pop")) {
                if(stack.isEmpty())
                    sb.append("-1\n"); // 스택이 비어있으면 -1 출력
                else
                    sb.append(stack.pop() + "\n");
            } else if (input.equals("size")) {
                // 스택의 크기 출력
                sb.append(stack.size() + "\n");
            } else if (input.equals("empty")) {
                // 스택이 비어있으면 1, 아니면 0 출력
                sb.append((stack.isEmpty() ? "1" : "0") + "\n");
            } else if (input.equals("top")) {
                if(stack.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(stack.peek() + "\n");
            }
        }
        System.out.print(sb);
    }
}
