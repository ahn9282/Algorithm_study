import java.util.*;

class Solution {
    public    String[]  solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Map<Character, List<String>> map = new TreeMap<>();
        for(String str : strings){
        char c = str.charAt(n);
            if(map.containsKey(c)){
                map.get(c).add(str);
            }else{
                map.put(c, new ArrayList<String>());
                 map.get(c).add(str);
            }
        }
        int idx = 0;
        for (List<String> list : map.values()) {
          if(list.size()>1){
             Collections.sort(list, (a, b) -> a.compareTo(b));
          }
            for(String s : list){
                answer[idx] = s;
                idx ++;
            }
        }
        return answer;
    }
}