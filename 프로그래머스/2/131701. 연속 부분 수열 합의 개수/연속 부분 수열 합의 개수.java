import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[2 * (elements.length)];
        for(int i=0;i< elements.length;i++){
            arr[i]= elements[i];  
            arr[i + elements.length] = elements[i];    
        }
        for(int i =0;i<elements.length;i++){
            int num =0;
            for(int j=i;j< i+elements.length ;j++){
                num += arr[j];
                set.add(num);
            }
        }
        return answer = set.size();
    }
}