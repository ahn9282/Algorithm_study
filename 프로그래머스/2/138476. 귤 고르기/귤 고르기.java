
import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
       int answer = 0;
        Map<Integer, Integer> m=new HashMap<>();

        for(int t:tangerine){
            m.put(t,m.getOrDefault(t, 0)+1);
        }
        List<Integer> list=new ArrayList<>(m.values());
        Collections.sort(list, Collections.reverseOrder());
        for (int i : list) {
            k -=i;
            answer++;
            if(k <=0) return answer;
        }
        return answer;
    }
}