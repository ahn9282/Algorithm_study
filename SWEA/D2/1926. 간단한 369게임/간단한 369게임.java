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
        int now = 1;
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            now = i;
            String str = "";
                while (now != 0) {
                    int one = now % 10;
                    if (one == 3 || one == 6 || one == 9) {
                        str += "-";
                    }
                    now = now / 10;
                }
                if(str.length() !=0){
                    sb.append(str);
                }else{
                    sb.append(i);
                }
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }
}
