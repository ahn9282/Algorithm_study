class Solution {
        public int solution(int n) {
            int answer = 0;
            if(n % 2 ==1) answer++;
            if(n==1)return 1;
            int sum  =1;
            int start =1;
            for (int i = 2; i <= n/2; i++) {
                sum +=i;
                if(sum >n) {
                    while (sum > n) {
                        sum = sum - start;
                        start++;
                    }
                }

                if(sum == n){
                    answer++;
                }
            }
            return answer + 1;
        }
    }