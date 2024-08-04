import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {

                map.put(clothe[1], map.getOrDefault(clothe[1],0) + 1);

        }
        System.out.println("map = " + map);
        if(map.size() == 1) return map.get(clothes[0][1]).shortValue();
        for (String s : map.keySet()) {
            answer *= map.get(s) + 1;
        }

        return answer - 1;
    }
}
