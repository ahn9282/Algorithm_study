import java.util.*;

class Solution {
    public String solution(String new_id) {
        
       StringBuilder sb = new StringBuilder();
        
      String lowerCase = new_id.toLowerCase();
        

     for (int i = 0; i < lowerCase.length(); i++) {
            char ch = lowerCase.charAt(i);
            if (Character.isLetterOrDigit(ch) || ch == '-' || ch == '_' || ch == '.') {
                sb.append(ch);
            }
        }
        
         String temp = sb.toString().replaceAll("\\.{2,}", ".");
        sb.setLength(0);
        sb.append(temp);
        
      removeDot( sb);
        
        if(sb.length() == 0){
            sb.append("a");
        }
        removeDot( sb);
          if (sb.length() > 15) {
            sb.setLength(15); 
        }
           removeDot( sb);
        while(sb.length() <3){
            sb.append(sb.charAt(sb.length() -1 ));
        }
        
     
        return sb.toString();
    }
       private static boolean contains(char[] array, char value) {
           
        for (char c : array) {
            if (c == value) {
                return true;
            }
        }
        return false;
    }
    private void removeDot(StringBuilder sb){
          if(sb.length() > 0 && sb.toString().startsWith(".") || sb.toString().endsWith(".")){
             if (sb.toString().startsWith(".")) {
                sb.deleteCharAt(0);
            }
              if (sb.length() > 0 && sb.toString().endsWith(".")) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}