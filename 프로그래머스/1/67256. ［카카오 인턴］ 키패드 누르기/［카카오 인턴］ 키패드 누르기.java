class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l =10;
        int r = 12;
        for(int i :numbers){
            if(i==1 || i == 4 || i == 7){
              answer +="L";
                 l = i ;
              
            }
             else if(i==3||i == 6 ||i == 9){
                answer +="R";
                 r = i ;
              
            }else{
                 if(i == 0) i =11;
             int ld = Math.abs(i-l)/3 + Math.abs(i-l)%3;
                int rd = Math.abs(i-r)/3 + Math.abs(i-r)%3;
             
                 if(rd > ld){
                      answer +="L";
                 l = i ;
                 }else if (ld > rd){
                    answer +="R";
                 r = i ; 
                 }else{
                     if(hand.equals("left")){
                         answer +="L";
                 l = i ;  
                     }else{
                         answer +="R";
                 r = i ;  
                     }
                 }
             }
         
                
            }
                      
        return answer;
    }
}