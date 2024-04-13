class Solution {
    public String solution(String[] survey, int[] choices) {
       
         String answer = "";
        int[] arr = new int[8];
        String sar[] = {"R","T","C","F","J","M","A","N"};
       for(int i =0 ; i < survey.length;i++){
           if(choices[i] <4){
              survey[i] = String.valueOf(survey[i].charAt(0)); 
               choices[i] = 4-choices[i] ;
           }else{
              survey[i] = String.valueOf(survey[i].charAt(1)); 
               choices[i] = choices[i] - 4;
           }
           for(int j =0; j < sar.length;j++){
               if(survey[i].equals(sar[j]))
                   arr[j] +=choices[i];
           }
       }
        
        for(int i =0;i < arr.length;i+=2){
            if(arr[i] > arr[i+1]){
                answer += sar[i];
               
            }else if(arr[i] < arr[i+1]){
                answer += sar[i +1];
                
            }else{
                answer += ((sar[i].compareTo(sar[i + 1]))<0)?sar[i]:sar[i + 1];
            }
        }
        return answer;
    }
}