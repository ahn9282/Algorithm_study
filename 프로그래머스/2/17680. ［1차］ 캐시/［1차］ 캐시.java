import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 5 * cities.length;

        if (cacheSize == 0) return answer;

        List<String> cache = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            if(cache.contains(s)){
                cache.remove(s);
                answer -= 4;
            }if(cache.size()==cacheSize){
                cache.remove(0);
            }
                cache.add(s);
        }
        System.out.println(cache);
        return answer;
    }
}