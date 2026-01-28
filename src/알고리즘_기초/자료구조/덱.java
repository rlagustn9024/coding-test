package 알고리즘_기초.자료구조;

import java.util.*;
import java.io.*;

/**
 * 백준 10866번 문제
 * */
public class 덱 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령의 수 N
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i ++) {
            String input = br.readLine();
            if(input.startsWith("push_front")) {
                Integer value = Integer.parseInt(input.split(" ")[1]);
                deque.offerFirst(value);
            } else if (input.startsWith("push_back")) {
                Integer value = Integer.parseInt(input.split(" ")[1]);
                deque.offerLast(value);
            } else if (input.equals("pop_front")) {
                if(deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.pollFirst() + "\n");
            } else if (input.equals("pop_back")) {
                if(deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.pollLast() + "\n");
            } else if (input.equals("size")) {
                sb.append(deque.size() + "\n");
            } else if (input.equals("empty")) {
                if(deque.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            } else if (input.equals("front")) {
                if(deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.getFirst() + "\n");
            } else if (input.equals("back")) {
                if(deque.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(deque.getLast() + "\n");
            }
        }
        System.out.print(sb);
    }
}
