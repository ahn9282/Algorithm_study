import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int fl = friends.length;
        Map<String, Integer> map = new HashMap<>();
        int[] giftscore = new int[fl];
        int[][] giftarr = new int[fl][fl];
        for(int i=0; i < fl;i++){
            map.put(friends[i],i);
        }
        for(String gift : gifts){
            String[] gar = gift.split(" ");
            String giver = gar[0];
            giftscore[map.get(giver)]++;
            String receiver = gar[1];
              giftscore[map.get(receiver)]--;
            giftarr[map.get(giver)][map.get(receiver)]++;
        }
        for(int i =0; i < fl ; i++){
            int num=0;
            for(int j=0; j < fl ; j++){
                if(i == j)continue;
                if(giftarr[i][j] > giftarr[j][i] || (giftarr[i][j] == giftarr[j][i] && giftscore[i] > giftscore[j]))num++;
            }
            if(answer < num) answer = num;
        }
        return answer;
    }
}