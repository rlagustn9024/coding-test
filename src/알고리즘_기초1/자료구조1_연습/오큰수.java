package 알고리즘_기초1.자료구조1_연습;

import java.util.*;
import java.io.*;

/**
 * 백준 17298번 문제 (Retry)
 * */
public class 오큰수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 수열의 크기 N
        int[] arr = new int[N+1];
        int[] NGE = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= N; i++) { // 배열 초기화
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(NGE, -1); // 기본값 -1로 설정

        // 오큰수 찾기
        // arr[1] ~ arr[N]까지 한바퀴 돌면서 가장 큰 수를 stack에 넣어서 유지한 채로 오큰수 계속 찾음
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= N; i++) { // 스택이 비어있거나, 오큰수가 없으면 push
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                NGE[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        for (int i = 1; i < NGE.length; i++) {
            sb.append(NGE[i]).append(" ");
        }
        System.out.print(sb);
    }
}
