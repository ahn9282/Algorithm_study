import java.util.*;
class Solution {
    public double solution(int[] arr) {

        double avg = (double)Arrays.stream(arr).sum() / arr.length;
        return avg;
    }
}