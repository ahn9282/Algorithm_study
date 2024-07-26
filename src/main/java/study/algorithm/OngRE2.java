package study.algorithm;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OngRE2 {
    public static void main(String[] args) {

        String[] bab2 = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(Solution.solution(bab2));
        String[] bab3 = new String[]{"ayaaya"};
        System.out.println(Solution.solution(bab3));
    }
    static class Solution {
        public static int solution(String[] babbling) {

            int answer = 0;
            String[] arr = new String[]{"aya", "ye", "woo", "ma"};
            for (String str : babbling) {

                for (String s : arr) {
                    str = str.replaceAll(s+"{2,}", "k");
                    System.out.println("str : "  + str +", now : " + s);
                    if (str.contains(s)) {

                        str =str.replaceAll(s,"");
                    }
                }
                if(str.length() == 0){
                    answer++;
                    System.out.println("Count Up!!");
                };
            }
            return answer;
        }
    }
}
