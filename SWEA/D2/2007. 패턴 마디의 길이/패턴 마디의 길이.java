
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            char[] charArray = str.toCharArray();
            String word = "";
            for (int j = 0; j < 10; j++) {
                String now = str.substring(0, j + 1);
                String compare = str.substring(j + 1, 2*j + 2);
                if(now.equals(compare)){
                    word = now;

                    break;
                }
            }

            sb.append("#" + i + " ");
            sb.append(word.length()+"\n");
        }
        System.out.println(sb.toString());
    }
}
