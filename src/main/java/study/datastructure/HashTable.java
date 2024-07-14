package study.datastructure;

import java.util.*;
import java.util.stream.Collectors;

public class HashTable {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
        ArrayList results = myHashTable.keys();
        System.out.println("results = " + results);

        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

    }
    private int size ;
    private Node[] dataMap;

    public HashTable( ) {
        size = 7;
        this.dataMap = new Node[size];
    }
    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(value, key);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (char keyChar : keyChars) {
            int asciiValue = keyChar;
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }
    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("    {" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    class Node {
        int value;
        String key;
        Node next;

        public Node(int value, String key) {
            this.value = value;
            this.key = key;
        }
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }
        for (int j : array2) {
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static Character firstNonRepeatingChar(String str){
        if(str.length() == 0)return null;
        char[] arr = str.toCharArray();
        char first = arr[0];
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == first) return null;
        }
        return first;
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);

            if (anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramGroups.put(canonical, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }
    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        Integer gap = null;
        int[] answer = new int[2];
        for (int  i =0; i < nums.length;i++) {

                gap = target - nums[i];
                if(map.containsKey(gap)){
                    answer[0] = map.get(gap);
                    answer[1] = i;
                    return answer;
                }else{
                    map.put(nums[i],i);
                }

        }
        return new int[0];
    }


    public static int[] subarraySum(int[] nums, int target) {
        Map<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (sumIndex.containsKey(currentSum - target)) {
                return new int[]{sumIndex.get(currentSum - target) + 1, i};
            }
            sumIndex.put(currentSum, i);
        }

        return new int[]{};
    }

}
