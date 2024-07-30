class Solution {
    public boolean solution(int x) {
        
        int num = 0;
       int num1 = x;
        while(x >0){
            num += x%10;
            x = x/10;
        }
        
        return num1 % num ==0;
    }
}