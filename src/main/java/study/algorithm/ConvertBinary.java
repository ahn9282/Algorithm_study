package study.algorithm;

public class ConvertBinary {
    public static void main(String[] args) {

        Solution s = new Solution();
        int[] s1 = s.solution("01110");
        System.out.println("=====================s1 ================");
        for (int i : s1) {
            System.out.println("i = " + i);
        }
        int[] s2 = s.solution("1111111");
        System.out.println("=====================s2 ================");
        for (int i : s2) {
            System.out.println("i = " + i);
        }
        int[] s3 = s.solution("10");
        System.out.println("=====================s3 ================");
        for (int i : s3) {
            System.out.println("i = " + i);
        }
    }

    static
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
                    }
                    now = now / 2;
                }
            }
            answer[0] = count;
            answer[1] = remove;
            return answer;
        }
    }
}


