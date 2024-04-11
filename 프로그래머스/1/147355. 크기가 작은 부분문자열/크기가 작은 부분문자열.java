class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long min = Long.parseLong(p);
        int l = p.length();
        for(int i= 0; i <= t.length()-l;i++){
            long v = Long.parseLong(t.substring(i,i+l));
            if(v <=min)answer++;
            
        
    }
        return answer;
    }
}