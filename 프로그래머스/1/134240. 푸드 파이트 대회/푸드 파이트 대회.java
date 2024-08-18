import java.util.*;
class Solution {
    public String solution(int[] food) {
        
        List<Integer>list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        list.add(1);
        for(int i = 1 ; i < food.length; i++){
            food[i] = food[i] / 2;
            for(int j = 0 ;j < food[i] ; j++){
               sb.append(i);
            }            
        }
        String str = sb.toString();
        sb.append("0");
        for(int i = str.length() - 1; i >=0;i--){
            sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }
}