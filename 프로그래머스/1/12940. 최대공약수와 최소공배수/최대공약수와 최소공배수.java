class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0]=GCD(n,m);
        
        
        answer[1] = m*n/answer[0];
        
   
        return answer;
    }
public int GCD(int a, int b) {
    if (b == 0) {
        return a;
    }
    return GCD(b, a % b);
}
}