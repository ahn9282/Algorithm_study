class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long tot = 0;
        for(int i=1;i <= count;i++){
            tot += i;
        }
        tot = price * tot;
        
        return answer = (tot > money)?tot - money:0;
    }
}