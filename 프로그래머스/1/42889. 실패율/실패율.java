
import java.util.*;
import java.util.stream.Collectors;
 class Solution {
        public int[] solution(int N, int[] stages) {
            Map<Integer, Double> map = new HashMap<>();
            int[] failCnts = new int[N + 2];
            int[] totCnts = new int[N + 1];

            for (int stage : stages) {
                failCnts[stage]++;
            }

            totCnts[N] = failCnts[N] + failCnts[N + 1];
            for (int i = N - 1; i >= 1; i--) {
                totCnts[i] = failCnts[i] + totCnts[i + 1];
            }

            for (int i = 1; i < totCnts.length; i++) {
                if (failCnts[i] == 0 || totCnts[i] == 0) {
                    map.put(i, 0.0);
                } else {
                    map.put(i, (double) failCnts[i] / totCnts[i]);
                }
            }
            List<Integer> list = new ArrayList<>(map.keySet());
            Collections.sort(list, (e1, e2) -> Double.compare(map.get(e2), map.get(e1)));
            return list.stream().mapToInt(e -> e).toArray();
        }
    }