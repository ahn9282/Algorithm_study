class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int remove = 0;
        while (!s.equals("1")) {
            char[] charr = s.toCharArray();
            int now = 0;
            for (char c : charr) {
                if (c == '0') remove++;
                if (c == '1') now++;
            }
            count++;
            s = "";
            while (now != 0) {

                if (now % 2 == 1) {
                    s = "1" + s;
                } else {
                    s = "0" + s;
                }
                now = now / 2;
            }
        }
        answer[0] = count;
        answer[1] = remove;
        return answer;
    }
}