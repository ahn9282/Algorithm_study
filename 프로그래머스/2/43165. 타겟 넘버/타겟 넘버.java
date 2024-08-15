class Solution {
 public static int answer;
      public  int solution(int[] numbers, int target) {
       answer = 0;
        recur(numbers, 0, 0, target);
        return answer;
    }
public  void recur(int[] arr, int index, int result, int target ) {

        if(index == arr.length ) {
            if(result == target)answer++;
            return;
        }
        recur(arr, index + 1, result + arr[index], target);
        recur(arr, index + 1, result - arr[index], target);
    }
}