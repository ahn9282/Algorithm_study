import java.util.*;
class Solution {
    public  int solution(int[] order) {
          int answer = 0;
        Stack<Integer> st = new Stack<>();
        int now =0;
        for (int i = 0; i < order.length; i++) {
            if (i +1== order[now]) {
                answer++;
                now++;
            } else if (!st.isEmpty() && st.peek() == order[now]) {
                st.pop();
                answer++;
                now++;
                i--;
            }else{
                st.add(i+1);
            }
        }

        while (!st.isEmpty()) {
            int remain = st.pop();
            if (remain == order[now]) {
                answer++;
                now++;
            }else{
                break;
            }
        }
        return answer;
    }
}