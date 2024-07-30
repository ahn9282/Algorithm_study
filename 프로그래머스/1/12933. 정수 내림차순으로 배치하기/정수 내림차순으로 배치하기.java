import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
       StringBuilder sb =new StringBuilder();
        for(int i = arr.length - 1; i>=0;i--){
            sb.append(arr[i]);
        }
        
        return Long.valueOf(sb.toString());
    }
}