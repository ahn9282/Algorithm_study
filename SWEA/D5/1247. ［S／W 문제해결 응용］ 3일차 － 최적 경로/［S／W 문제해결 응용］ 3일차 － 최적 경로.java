import java.io.*;
import java.util.StringTokenizer;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
      static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int N, answer, startX, startY, homeX, homeY;
    static int[][] arr;
    static boolean[] visited;
    
	public static void main(String args[]) throws Exception
	{
		 br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int t = 1; t <= N; t++) {
            int T = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            homeX = Integer.parseInt(st.nextToken());
            homeY = Integer.parseInt(st.nextToken());

            arr = new int[T][2];
            visited = new boolean[T];
            for (int i = 0; i < T; i++) {
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            answer = Integer.MAX_VALUE;
            dfs(0, startX, startY, 0);
            bw.write("#" + t + " " + answer + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static void dfs(int count, int currentX, int currentY, int distance) {
        if (count == arr.length) {
            distance += Math.abs(currentX - homeX) + Math.abs(currentY - homeY);
            answer = Math.min(answer, distance);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int newDistance = distance + Math.abs(currentX - arr[i][0]) + Math.abs(currentY - arr[i][1]);
                dfs(count + 1, arr[i][0], arr[i][1], newDistance);
                visited[i] = false;
            }
        }
	}
}