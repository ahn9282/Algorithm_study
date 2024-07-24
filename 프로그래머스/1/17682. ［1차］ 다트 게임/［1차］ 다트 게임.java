import java.util.*;

class Solution {
    public int solution(String dartResult) {
            int answer = 0;
        
        String[] dart = dartResult.split("");
        int[] score = new int[3];
        
        int idx = -1;
        
        for(int i = 0 ; i < dart.length; i++){
            
            if(dart[i].matches("[0-9]")){
                 idx++;
                score[idx] = Integer.parseInt(dart[i]);
                 
                if(dart[i+1].matches("[0-9]")){
                    score[idx] = 10;
                    i++;
                }
              
            }
            
            if(dart[i].equals("D")){
                score[idx] = (int)Math.pow(score[idx],2);
            }
             if(dart[i].equals("T")){
                 score[idx] = (int)Math.pow(score[idx],3);
             }
             if(dart[i].equals("*")){
                 score[idx] *= 2 ;
                 if(idx - 1 >=0) score[idx - 1] *=2;
             }
             if(dart[i].equals("#")){
                 score[idx]  *= -1; 
             }
           
        }
            for(int n : score){
                answer +=n;
            }
        
        return answer;
    }
}