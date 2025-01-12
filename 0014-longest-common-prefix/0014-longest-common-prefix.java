class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";

    String str = strs[0];
    int max = str.length();

    for (int i = 1; i < strs.length; i++) {
        char[] nowArr = strs[i].toCharArray();
        int len = Math.min(max, nowArr.length);
        for (int j = 0; j < len; j++) {
            if (str.charAt(j) != nowArr[j]) {
                max = j;
                break;
            }
        }
        max = Math.min(max, len);
        if (max == 0) return "";
    }
    return str.substring(0, max);
}
}