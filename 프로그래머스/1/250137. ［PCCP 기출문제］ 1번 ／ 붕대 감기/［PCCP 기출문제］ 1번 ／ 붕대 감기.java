class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) { 
        int count = 0;
        int life = health;
        int attack = 0;
        for(int i =1 ; i<= attacks[attacks.length-1][0];i++){
            if(attacks[attack][0] == i){
             count = 0;
                life=life-attacks[attack][1];
                attack++;
                if(life <=0)return -1;
            }else{
                if(life<health){
                    life += bandage[1];
                    count +=1;
                    if(count == bandage[0]){
                        life+=bandage[2];
                        count = 0;
                    }
                }
                if(life >= health){life = health;}
            }
        
    }
        return life;
    }
}