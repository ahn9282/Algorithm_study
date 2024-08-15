import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
          int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < prices.length; i++) {
          
            while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                int idx = st.pop();
                answer[idx] = i - idx;
            }
            st.push(i);
        }
        int last = prices.length - 1;
        while (!st.isEmpty()) {
            int remain = st.pop();
            answer[remain] = last - remain;
        }
        return answer;
    }
}