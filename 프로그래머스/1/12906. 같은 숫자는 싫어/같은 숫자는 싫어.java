import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     int len = arr.length;
      for(int i=1;i<arr.length;i++){
          if(arr[i] == arr[i-1]){
              arr[i-1] = -1;
              len -=1;
          }
      }
  
 int[] answer = new int[len];
        int count =0;
        for(int a : arr){
            if(a != -1){
                answer[count] = a;
                count++;
            }
        }
        return answer;
    }
}