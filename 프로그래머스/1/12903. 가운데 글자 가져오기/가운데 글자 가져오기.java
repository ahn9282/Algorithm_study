class Solution {
    public String solution(String s) {
                if(s.length() == 1 || s.length() == 2)return s;
        
       StringBuilder sb = new StringBuilder();

        int leng = s.length()/ 2;
        if(s.length() %2 ==1){
            sb.append(String.valueOf(s.charAt(leng )));
        }else{
            sb.append(String.valueOf(s.charAt(leng -1)));
            sb.append(String.valueOf(s.charAt(leng )));
        }

        return sb.toString();
    }
}