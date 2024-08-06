

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N; 
    public static int M; 

    public static int[] arr;
    public static boolean[] check;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());
        br.close();
        arr = new int[M];
        check = new boolean[N];

        recur(0);
        System.out.println(sb.toString());
    }

    public static void recur(int depth) {
        if(depth == M){
            for (int i : arr) {
                sb.append(i).append(" ");
  
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[depth] = i + 1;
                recur(depth + 1);

                check[i] = false;
            }
        }

    }

}


