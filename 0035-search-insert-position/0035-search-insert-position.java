class Solution {
    public int searchInsert(int[] nums, int target) {
        int posi = 0;
        for(int i : nums){
            if(target> i) posi++;
        }
        return posi;
    }
}