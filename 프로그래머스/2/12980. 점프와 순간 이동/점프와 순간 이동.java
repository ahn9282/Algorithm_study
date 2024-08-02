import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        if(n <= 2) return n;
        int target = 1;
        while(n > 0){
            if( n % 2 ==1){
                n = (n - 1)/2;
                ans++;
            }else{
                n/=2;
            }
        }

        return ans;
    }
}