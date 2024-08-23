import java.util.*;
class Solution {
    public  int solution(int[] arr) {
        for(int i =1; i < arr.length;i++){
            int a = arr[i-1];
            int b = arr[i];
            int gcd = gcd(a,b);
            arr[i] = b*a / gcd;
        }
        return arr[arr.length - 1];
    }
    public int gcd(int a, int b){
        if(a % b ==0){
            return b;
        }else{
           return gcd(b, a%b);
        }
    }

}