/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb;
        int iter = 10;

        for (int i = 1; i <= iter; i++) {

            sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Queue<Integer> que = new LinkedList<>();

            for (int j = 0; j < 8; j++) {
                int i1 = Integer.parseInt(st.nextToken());
                que.add(i1);
            }
            decode(que);
            int range = que.size();
            sb.append("#" + N);
            for (int j = 0; j < range; j++) {
                sb.append(" " + que.poll());
            }
            System.out.println(sb.toString());
        }
    }

    static void decode(Queue<Integer> que) {
        boolean go = true;
        int count = 1;
        while (go) {
            if (count > 5) count = 1;
            int value = que.poll();

            int code = value - count;
            if (code <= 0) {
                go = false;
                code = 0;
            }
            que.add(code);
            count++;

        }
    }

}
