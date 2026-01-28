package 알고리즘_기초1.자료구조1;

import java.io.*;
import java.util.*;

/**
 * 백준 9093번 문제
 * */
public class 단어_뒤집기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();

            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == ' ') { // 공백 만나면 스택 출력
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else // 공백 아니면 계속 집어넣음
                    stack.push(input.charAt(j));
            }
            // 마지막 단어는 공백을 만나지 못하기 때문에 별도로 출력
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    /**
     * 더 빠른 풀이
     * */
    public static void main2(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] words = br.readLine().split(" ");

            for(String word:words){
                StringBuilder sb= new StringBuilder(word);
                result.append(sb.reverse().append(" "));
            }
            result.append("\n");
        }
        System.out.print(result);
    }
}
