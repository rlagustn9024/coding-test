package 알고리즘_기초.자료구조;

import java.util.*;
import java.io.*;

/**
 * 백준 1874번 문제
 * */
public class 스택_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int start = 0; // 시작점
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input > start) { // 더 큰 수가 들어온 경우 push
                // 시작점 + 1부터 input까지 반복하면서 push
                for(int j = start + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = input;
            } else if(stack.peek() != input) { // top에 있는 원소가 입력받은 값과 같지 않은 경우
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }
        System.out.print(sb);
    }
}

