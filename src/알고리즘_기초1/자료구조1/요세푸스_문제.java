package 알고리즘_기초1.자료구조1;

import java.util.*;
import java.io.*;

/**
 * 백준 1158번 문제
 * */
public class 요세푸스_문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) { // 1부터 N까지 큐에 삽입
            queue.offerLast(i);
        }

        sb.append("<");
        while (!queue.isEmpty()) { // 큐가 빌때까지 반복
            // K-1번까지는 그냥 다시 뒤로 보냄
            for (int j = 0; j < K - 1; j++) {
                queue.offerLast(queue.pollFirst());
            }

            if (queue.size() != 1) {
                sb.append(queue.pollFirst() + ", "); // K번째는 넣음
            } else {
                sb.append(queue.pollFirst());
            }
        }
        sb.append(">");
        System.out.print(sb);
    }
}
