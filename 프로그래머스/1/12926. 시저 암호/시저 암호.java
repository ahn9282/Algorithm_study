import java.util.*;

class Solution {
    public String solution(String s, int n) {
        char[] chArr = s.toCharArray();
        boolean isUpper = false;

        StringBuilder sb = new StringBuilder();
        for(char c : chArr){
            
            if(c <97) isUpper = true;
              
            if(c == ' '){
                
            }else{
                c = Character.toLowerCase(c);
                c = (char)((c+n)% 122 ==0?122:(c+n)% 122 <97?(c+n)% 122 + 96: (c+n)% 122) ;
                
              
            }
            if(isUpper){
                c =Character.toUpperCase(c);
                isUpper=false;
            }
            sb.append(c);
            
        }
        
        return sb.toString();
    }
}