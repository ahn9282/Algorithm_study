package study.algorithm;

public class ConvertNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution1 = s.solution(10, 40, 5);
        System.out.println("solution 1 = " + solution1);
        solution1 = s.solution(10, 40, 30);
        System.out.println("solution 2 = " + solution1);
        solution1 = s.solution(2, 5, 4);
        System.out.println("solution 3 = " + solution1);
    }

   static  class Solution {
        public int solution(int num, int y, int n) {
            int count = 0;
            if (num == y) return count;

            while (num <= y) {
                if ((y / num % 3) == 0) {
                    num = num * 3;
                } else if ((y / num % 2) == 0) {
                    num = num * 2;
                } else {
                    num -= n;
                }
                count++;
                if(num == y) return count;
            }
            return -1;
        }
    }
}
