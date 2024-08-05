
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int max = 0;
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
         arr =new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        recur(0, 0);
        System.out.println(max);
    }

    public static void recur(int index, int money) {
    
        if (index > arr.length - 1) {
            max = Math.max(max, money);
            return;
        }
        if(index + arr[index][0] < arr.length + 1 ) {
            recur(index + arr[index][0], money + arr[index][1]);
        }
        recur(index + 1, money);
    }
}
