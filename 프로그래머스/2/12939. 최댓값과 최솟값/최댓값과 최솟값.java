class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = 0;
        int min = 0;
        for(String str : arr){
            int num = 0;
          if(str.contains("-")){
             num= (-1) * Integer.valueOf(str.replace("-",""));
          }else{
              num=  Integer.valueOf(str); 
          }
            if(min == 0 && max == 0){
                min=num;
                max = num;
            }
            if(num <min)min =  num;
            if(num > max)max =  num;
        }
        
        return min + " " + max;
    }
}