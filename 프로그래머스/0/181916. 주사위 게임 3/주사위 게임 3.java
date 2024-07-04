import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Set<Integer> set = new TreeSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        
        if (set.size() == 1) {
        
            answer = 1111 * a;
        } else if (set.size() == 2) {
           
            int[] arr = {a, b, c, d};
            Arrays.sort(arr);

            int th = arr[0] * arr[1] * arr[2]; 

            if (arr[0] == arr[2]) {
                
                answer = (int) Math.pow((10 * arr[0] + arr[3]), 2);
                
            } else if (arr[3] == arr[1]) {
                
                answer = (int) Math.pow((10 * arr[3] + arr[0]), 2);
            } else {
                answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
            }
        } else if (set.size() == 3) {
          
            int q = 1;
            for (int num : set) {
                if (Collections.frequency(Arrays.asList(a, b, c, d), num) == 2) {
                  
                } else {
                    q *= num; 
                }
            }
            answer = q;
        } else {

            answer = Math.min(a, Math.min(b, Math.min(c, d)));
        }
        
        return answer;
    }
}
