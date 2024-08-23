class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int a = 0; a < number.length-2;a++){
            for(int b = a+1 ; b < number.length - 1;b++){
                for(int c = b+1 ; c < number.length;c++ ){
                    int sum = number[a]+number[b]+number[c];
                    if(sum == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}