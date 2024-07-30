import java.util.*;
class Solution {
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