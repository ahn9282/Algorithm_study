
import java.util.*;
class Solution {
        public static int solution(String[] babblings) {

            int answer = 0;
            String[] arr = new String[]{"aya", "ye", "woo", "ma"};
            
            for (String str : babblings) {
                if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama")) {
                continue;
            }
                
                str = str.replace("aya", " ");
            str = str.replace("ye", " ");
            str = str.replace("woo", " ");
            str = str.replace("ma", " ");
            str = str.replace(" ", "");
                
                if(str.length() == 0)answer++;
            }
            return answer;
        }
    }