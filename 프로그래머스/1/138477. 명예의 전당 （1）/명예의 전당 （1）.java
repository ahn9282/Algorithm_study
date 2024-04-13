import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < score.length;i++){
            if(k-1>i){
                   l.add(score[i]);
                  l.sort(Collections.reverseOrder());
                   answer[i] = l.get(l.size()-1);
            }else{
               l.add(score[i]);
                l.sort(Collections.reverseOrder());
                answer[i] = l.get(k-1);
            }
        }
        return answer;
    }
}