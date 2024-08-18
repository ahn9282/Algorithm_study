import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] bf ;
        boolean as = false;
        while(true){
            as = false;
            bf= Arrays.copyOf(arr, arr.length);
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i]>=50 && arr[i] % 2 ==0){
                    arr[i] /=2;
                    as = true;
                }
                if(arr[i]< 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;   
                    as = true;
                }
            }
            if(!as)break;
            answer++;
        }
        return answer;
    }
}