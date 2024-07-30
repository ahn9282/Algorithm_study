class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean containBar = s.contains("-");
        int num = Integer.valueOf(s.replace("-", ""));
        
        return containBar? (-1) * num : num;
    }
}