import java.util.*;
    class Solution {
    public  int solution(int[] sides) {
        int answer = 0;
       
        Arrays.sort(sides);
        for(int i = sides[1]-sides[0];i<=sides[1];i++){
            if(i + sides[0]>sides[1]){
               
                answer+=1;
            }
        }
        for(int i = sides[1] + 1;i<(sides[0]+sides[1]);i++){
            answer+=1;
            
        }
        return answer;
    }
}