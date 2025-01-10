class Solution {
    public int lengthOfLongestSubstring(String s) {
       boolean[] exist = new boolean[128];
        int result = 0, explore = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 중복 문자가 있으면 윈도우 시작 위치를 조정
            while (exist[c]) {
                exist[s.charAt(explore)] = false;
                explore++;
            }

            exist[c] = true;
            result = Math.max(result, i - explore + 1);
        }

        return result;
        }
}