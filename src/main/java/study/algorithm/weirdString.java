package study.algorithm;

public class weirdString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("try hello world"));
        System.out.println(solution.solution("try   hello     world"));
        System.out.println(solution.solution("asd   qwer     qwe  "));
    }

}

class Solution {
    public String solution(String s) {

        char[] charr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int order = 1;
        for (int i = 0; i < charr.length; i++) {

             if (charr[i] == ' ') {
                sb.append(" ");
                order = 1;
            } else if (order % 2 == 1) {
                sb.append(Character.toUpperCase(charr[i]));
                order++;

            } else {
                 sb.append(Character.toLowerCase(charr[i]));
                order++;
            }
        }

        return sb.toString();
    }
}