
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());
        br.close();
        long result = result = bibi(num2) - bibi(num1 - 1);
        System.out.println(result);
    }
    private static long bibi(long num) {
        long val = num;
        for (long i = 2; i <= num; i *= 2) {
            val += num / i * (i /2);
        }

        return val;
    }
}

