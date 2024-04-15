class Solution {
    public String solution(String phone_number) {
        String answer = phone_number;
        int len = answer.length();
        if(len >4){
            String[] arr = answer.split("");
            answer="";
            for(int i =0 ; i<arr.length;i++){
                if(i < arr.length-4){
                arr[i]="*";       
                }
             
                answer +=arr[i];
            }
            
        }
        return answer;
    }
}