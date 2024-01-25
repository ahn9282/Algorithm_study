class Solution {
    public String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
       int i =a.length()-1;
       int j = b.length() - 1;
       int sum = 0;
       while(sum >0|| i>=0 || j>=0){
           if(i >=0){
               sum += a.charAt(i) -'0';
               i--;
           }
           if(j >=0){
                sum += b.charAt(j)-'0';
               j--;
           }
           sb.append(sum % 2);
           sum /=2;
       }
        String str = sb.reverse().toString();
        return str;
    }
}