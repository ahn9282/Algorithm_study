
class Solution {
    public int solution(int n) {

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
