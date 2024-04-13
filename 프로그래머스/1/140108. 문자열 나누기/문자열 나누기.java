class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        char first = s.charAt(0);
        for(char c : s.toCharArray()){
            if(num ==0) first = c;
            if(c == first){
                num -=1;
            }else{
                num +=1;
            }
            if(num == 0){
                answer++;
            }
        }
        if(num != 0) answer++;
    return answer;
    }
}