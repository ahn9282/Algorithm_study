class Solution {
    public  int[] solution(int brown, int yellow) {
        int countArr = brown + yellow;
        int col = 3;
        int raw = countArr / col;
        
        while((raw - 2) * (col - 2) != yellow){
            col+=1;
            raw = countArr / col;
        }
        int[] answer = new int[]{raw, col};
        return answer;
    }
}