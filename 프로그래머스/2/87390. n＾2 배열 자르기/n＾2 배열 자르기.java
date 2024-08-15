class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left) + 1;
            int[] answer = new int[len];
            System.out.println("len = " + len);
            long start = left;
            for (long i = left; i <= right; i++) {
                int base = (int)(i/n);
                int h = (int) (i % n);
                answer[(int)(i - left)] = Math.max(base,h)+1;
            }
            return answer;
    }
}