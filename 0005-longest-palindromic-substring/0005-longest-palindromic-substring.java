class Solution {
     public  String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        if(s.length() <= 2) {
            if(s.length()==2 && s.charAt(0)==s.charAt(1) )return s;
            return s.substring(0, 1);
        }
 String result = "";
        int maxLength  = 0;

        for (int i = 0; i < s.length() -1 ; i++) {
            int len = 0;
             
                int len1 = getPalindromic(s, i, i + 1);
          
                int len2 = getPalindromic(s, i, i );

            len = Math.max(len1, len2);
            if (len > maxLength) {
                maxLength = len;
                result = s.substring(i - (len - 1) / 2, i + len / 2 + 1);
            }
        }

        return result;
    }

    private  int getPalindromic(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int len = right - left - 1;
        return len;
    }

}