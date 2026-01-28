package 알고리즘_기초1.자료구조1;

import java.io.*;
import java.util.*;

/**
 * 백준 9012번 문제
 * */
public class 괄호 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 데이터 T개
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            boolean isVPS = true;
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == '(') {
                    stack.push('(');
                } else if (input.charAt(j) == ')') {
                    if(stack.isEmpty()) { // pop하려는데 스택이 비어있을 경우
                        isVPS = false;
                        break;
                    }
                    else
                        stack.pop();
                }
            }

            if(isVPS && stack.isEmpty())
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.print(sb);
    }
}
