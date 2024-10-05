
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;
import java.util.StringTokenizer;


class Solution
{
	public static void main(String args[]) throws Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int now = 0;
            int count = 0;

            while (now <= N) {
                if (y < x) {
                    y += x;
                    now = y;
                } else {
                    x += y;
                    now = x;
                }
                count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
	}
}