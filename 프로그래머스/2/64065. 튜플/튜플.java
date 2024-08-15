import java.util.*;
class Solution {
    public int[] solution(String s) {
         
        String str = s.substring(0, s.length() - 1).substring(1);
        String str2 = str.replaceAll("\\},\\{", "} {");
        String str3 = str2.replaceAll("[{}]", "");
        String[] arr = str3.split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (String string : arr) {
            String[] split = string.replaceAll(",", " ").split(" ");
            for (int i = 0; i < split.length; i++) {
                int now = Integer.parseInt(split[i]);
                map.put(now, map.getOrDefault(now, 0) + 1);
            }
        }
        int[] answer = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
        System.out.print("answer : [");
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        return answer;
    }
}