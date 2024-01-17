import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
       int num = 1;
       int n = nums[0];
       for(int i = 0;i < nums.length;i++){
           if(n != nums[i]){
               n=nums[i];
               nums[num] = n;
               num++;
           }
       }
       return num; 
    }
}