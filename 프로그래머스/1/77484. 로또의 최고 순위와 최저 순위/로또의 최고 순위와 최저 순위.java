import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
      Arrays.sort(lottos);
        int fixnum= win_nums[0];
        int zero=0;
        Set<Integer> set = new HashSet<>();
      for(int i =0; i < lottos.length;i++){
          if(lottos[i]==0){
              zero+=1;
              lottos[i] = fixnum;
          }else{
              break;
          }
      }
        for(int j =0; j <6;j++){
            set.add(lottos[j]);
            set.add(win_nums[j]);
        }
         
        if( zero==6){
        zero-=1;}
        if(set.size()==0){
            zero=0;
        }
        answer[0] =set.size()-5;
        answer[1] = answer[0] + zero;
        if(set.size()==12){
           answer[0] =6;
        answer[1] = 6;  
        }
       
        return answer;
    }
}