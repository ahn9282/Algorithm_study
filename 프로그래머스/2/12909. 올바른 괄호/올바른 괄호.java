class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr =s.toCharArray();
        int count = 0;
        for(char c : arr){
            if(c == '(')count ++;
            if(c == ')')count --;
            if(count <0) return false;
        }

        return count==0;
    }
}