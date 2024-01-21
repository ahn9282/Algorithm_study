import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String[] sar = s.split(" ");
        int answer =sar[sar.length-1].length();
        return answer;
    }
}