package study.algorithm;

public class NextBiggerNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result1 = s.solution(78);
        System.out.println("result1 = " + result1);
    }
}

class Solution {
    public int solution(int n) {
        long startTime = System.currentTimeMillis();
        int num = n + 1;
        int len = binary(n);
        int answer = 0;
        while (true) {
            if (binary(num) == len) {
                answer = num;
                break;
            }
            num++;
        }
        long endTime = System.currentTimeMillis();
        long dueTime = endTime - startTime;
        System.out.println("dueTime = " + dueTime);
        return answer;
    }

    public int binary(int now) {
        int s = 0;
        while (now != 0) {

            if (now % 2 == 1) s++;

            now = now / 2;
        }
        return s;
    }
}

