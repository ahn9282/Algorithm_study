class Solution {
public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1,
                'V', 5, 'X', 10, 'L', 50,
                'C', 100, 'D', 500, 'M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < s.length() - 1) {
            char next = s.charAt(i+1);
                switch (c) {
                    case 'I':
                        if(next=='V' || next=='X'){
                            result -=2;
                        }
                        break;
                    case 'X':
                        if(next=='L' || next=='C'){
                            result -=20;

                        }
                        break;
                    case 'C':
                        if(next=='D' || next=='M'){
                            result -=200;

                        }
                        break;
                }
            }

            result += map.get(c);
        }
        return result;
    }
}