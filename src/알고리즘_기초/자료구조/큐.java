package 알고리즘_기초.자료구조;

import java.util.*;
import java.io.*;

/**
 * 백준 10845번 문제
 * */
public class 큐 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.startsWith("push")) { // 정수 X를 큐에 넣음
                int value = Integer.parseInt(input.split(" ")[1]); 
                queue.offerLast(value);
            } else if (input.equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.pollFirst() + "\n");
                }
            } else if (input.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (input.equals("empty")) {
                if(queue.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            } else if (input.equals("front")) {
                if(queue.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(queue.getFirst() + "\n");
            } else if (input.equals("back")) {
                if(queue.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(queue.getLast() + "\n");
            }
        }
        System.out.print(sb);
    }
}
