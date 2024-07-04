package study.basic;

import java.util.HashMap;

public class Pointers {
    public static void main(String[] args) {
         int num1 = 11;
         int num2 = num1;

        num1 = 22;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;
        map1.put("value", 22);
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);
        map3.put("value", 57);
        map2 = map3;
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);
        System.out.println("map3 = " + map3);
    }


}
