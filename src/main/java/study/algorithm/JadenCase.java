package study.algorithm;

public class JadenCase {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "  Happy new YEAr      ";
        System.out.println("lower [" + str.toLowerCase() + "]");
        String arr[] = str.split(" ");
        for (String string : arr) {
            System.out.println("string = " + string);
        }
        String solution = s.solution(str);
        System.out.println("str = " + str);
        System.out.println("solution = |" + solution + "|");
        String solution2 = s.solution("For The Last Week");
        System.out.println("solution2 = |" + solution2 + "|");
    }

    static class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder();
            String[] arr = s.split(" ");
            for(int i=0; i<arr.length; i++) {
                String str = arr[i];
                if (str.isEmpty()) {
                    sb.append(" ");
                }else{
                    sb.append(Character.toUpperCase(str.charAt(0)));
                    sb.append(str.toLowerCase().substring(1));
                    sb.append(" ");
                }
            }
            String string = sb.toString();
            if(s.endsWith(" ")) return string;
            return string.substring(0, string.length() - 1);
        }
    }
    }
