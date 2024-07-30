class Solution {
    boolean solution(String s) {
        boolean answer = false;
        char[] arr = s.toUpperCase().toCharArray();
        int countP = 0;
        int countY = 0;
        for(char c : arr){
            if(c == 'P')countP++;
            if(c == 'Y')countY++;
        }
        if(countP == countY) answer = true;
        return answer;
    }
}