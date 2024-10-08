class Solution {
    static boolean[] already;
    static int answer;
    static int limit;
    public  int solution(int k, int[][] dungeons) {
        answer = 0; 
        limit = dungeons.length;
        already = new boolean[limit];
        for (int i = 0; i < limit; i++) {
            if (k >= dungeons[i][0]) {
                already[i] = true;
                recur(i, 1, k - dungeons[i][1], dungeons);
                already[i] = false;
            }
        }
        return answer;
    }
    public  void recur(int idx, int count, int point, int[][] arr) {
        answer = Math.max(answer, count);
        if (count == limit) {
            return;
        }
        for (int i = 0; i < limit; i++) {
            if (!already[i] && arr[i][0] <= point) {
                already[i] = true;
                recur(i, count + 1, point - arr[i][1], arr);
                already[i] = false;
            }
        }
    }
}