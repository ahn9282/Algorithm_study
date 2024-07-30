package study.algorithm;
import java.util.*;

public class DonutStickGraph {
    public static void main(String[] args) {
        int[][] array = {
                {4, 11},    {1, 12}, {8, 3},   {12, 7},
                {4, 2}, {7, 11},  {4, 8},
                {9, 6}, {10, 11},
                {6, 10}, {3, 5},   {11, 1},
                {5, 3},  {11, 9},  {3, 8}
        };
        Solution s = new Solution();
        int[] solution = s.solution(array);
        System.out.print(" answer : ");
        for (int i : solution) {
            System.out.print("i = " + i + "\t");
        }
    }
  static class Solution {
    public  int[] solution(int[][] edges) {
        int[] answer = new int[4];
        for (int[] one : edges) {
            if(one[0] == one[1]){
                answer[1] +=1;
            }
        }
            return answer;
    }
}
}

