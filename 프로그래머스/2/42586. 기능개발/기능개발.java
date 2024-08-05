import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> queue = new LinkedList<>();
            int before = 0;
            for (int i=0; i<progresses.length; i++) {
                int day = 0;
                int progress = progresses[i];

                while (true) {
                    progress += speeds[i];
                    day++;
                    if (progress >= 100) {
                        break;
                    }
                }

                if (before < day) {

                    queue.offer(day);
                    before = day;
                }
            }

            int idx = 0;
            int index = 0;

            int[] answer = new int[queue.size()];
            for (Integer d : queue) {
                int count = 0;

                for (int i = idx; i < progresses.length; i++) {
                    if (progresses[i] + (speeds[i] * d) >= 100) {
                        count++;
                    } else {
                        idx = i;
                        break;
                    }
                }
                System.out.println();
                answer[index] = count;
                index++;
            }
            return answer;
            }
}