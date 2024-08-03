

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            sum += (long) ((n - i) / i) * i;
        }
        System.out.println(sum % 1000000);

    }


}
