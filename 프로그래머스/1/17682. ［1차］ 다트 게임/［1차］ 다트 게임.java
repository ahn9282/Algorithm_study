import java.util.*;

class Solution {
    public int solution(String dartResult) {
          int answer = 0;
        int[] scores = Arrays.stream(dartResult.split("[SDT*#]"))
            .filter(e -> ! e.isEmpty()).mapToInt(e -> Integer.parseInt(e)).toArray();
            
        StringBuilder sb = new StringBuilder();
       
       for (int i = 0; i < scores.length; i++) {
            sb.append(scores[i]);
           if(i < 2){
               sb.append("|");
           }
        }
        String splitCond = sb.toString();
        String[] condArr = dartResult.split(splitCond);
        
        for(int i =1; i <= 3; i++){
              if(condArr[i].contains("D")){
                scores[i - 1] = (int)Math.pow(scores[i - 1],2);
            }
             if(condArr[i].contains("T")){
                 scores[i - 1] = (int)Math.pow(scores[i - 1],3);
             }
             if(condArr[i].contains("*")){
                 scores[i - 1] *= 2;
                 if(i -2 >=0){
                     scores[i - 2] *= 2; 
                 }
             }
             if(condArr[i].contains("#")){
                 scores[i - 1] *= -1;
             }
            
        }
        answer = Arrays.stream(scores).sum();
        
        return answer;
    }
}