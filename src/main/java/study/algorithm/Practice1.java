package study.algorithm;

public class Practice1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = s.solution(1000000000);
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }

    static class Solution {
        public int[] solution(long n) {
            String str = String.valueOf(n);
            int[] answer = new int[str.length()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = Integer.parseInt(str.substring(answer.length - 1 - i, answer.length - i));
            }

            return answer;
        }
    }
}
