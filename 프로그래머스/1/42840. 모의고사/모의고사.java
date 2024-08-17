import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] user1 = new int[]{1,2,3,4,5};
        int[] user2 = new int[]{2,1,2,3,2,4,2,5};
        int[] user3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int a = 0;
        int b =0; 
        int c = 0;
        for(int i = 0 ; i < answers.length;i++){
            if(user1[i % 5] == answers[i])a++;
            if(user2[i % 8] == answers[i])b++;
            if(user3[i % 10] == answers[i])c++;
        }
        int max = Math.max(a,Math.max(b,c));
        int count = 0;
       if(max == a)count++;
        if(max == b)count++;
        if(max == c)count++;
        List<Integer> list = new ArrayList<>();
        if(max == a)list.add(1);
        if(max == b)list.add(2);
        if(max == c)list.add(3);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}