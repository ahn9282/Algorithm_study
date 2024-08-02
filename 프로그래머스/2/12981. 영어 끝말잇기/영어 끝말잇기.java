import java.util.*;
class Solution {
    public  int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        String before = words[0].substring(words[0].length() - 1);
        set.add(words[0]);
        int setSize = 1;
        int count = 1;

        for(int i =1 ; i < words.length; i++){
            set.add(words[i]);
            count++;
         
            if (! words[i].startsWith(before) || words[i].length() == 1) {
                
                break;
            }
            if(setSize == set.size()){
               
                break;
            }
            before = words[i].substring(words[i].length() - 1);

            setSize = set.size();
        }
        
        if(count +1 == words.length + 1 && setSize == words.length){
            answer[0] = 0;
            answer[1] = 0;

        }else{
            answer[0] = ((count) % n == 0)?n:(count)%n ;
            answer[1] = (count % n == 0)?count/n:count / n + 1;
        }
        return answer;
    }
}