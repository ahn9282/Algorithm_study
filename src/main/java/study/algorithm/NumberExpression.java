package study.algorithm;

public class NumberExpression {
    public static void main(String[] args) {
        Solution s = new Solution();
        int number = 15;

        int solution = s.solution(number);
        System.out.println("solution = " + solution);
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            if(n % 2 ==1) answer++;
            if(n==1)return 1;
            int sum  =1;
            int start =1;
            for (int i = 2; i <= n/2; i++) {
                System.out.println("START!!! num : " + i);
                sum +=i;
                if(sum >n) {
                    while (sum > n) {
                        sum = sum - start;
                        start++;
                    }
                }

                if(sum == n){
                    answer++;
                    System.out.println("EQUAL!!! NOW sum : "+sum+" range : "+ start + " ~ " + i);
                }
            }
            return answer + 1;
        }
    }
}
