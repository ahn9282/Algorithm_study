import java.util.*;

class Solution {
    public boolean solution(String s) {
     String str = "";
        if(s.length() == 4 || s.length() ==6){
  
     str = s.replaceAll("[0-9]", "");
          }else{
            return false;
        }
        
        return str.length() == 0;
    }
}