class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean we= true;
        for(int i=0; i<n;i++){
             int n1 = 0;
            int n2 =0;
            StringBuffer sb = new StringBuffer(n);
            we = true;
        for(int j=0;j<n;j++){
             n1= arr1[i] % 2;
            arr1[i] /=2;
             n2 = arr2[i] % 2;
            arr2[i] /=2;
            if(n1 ==1 || n2 ==1){
                sb.append(1);
            }else{
               sb.append(0);
            }
    
        }
            
            answer[i] =sb.reverse().toString();
        }
        for(int i=0;i<n;i++){
        answer[i] = answer[i].replaceAll("1", "#");
        answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}