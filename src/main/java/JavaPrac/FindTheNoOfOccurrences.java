package JavaPrac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheNoOfOccurrences {

    public static void main(String[] args) {
        findNoOfOccurrences("rama surya narayana kondi satya narayana kondi adi narayana kondi");
        findNumberOfCharOccurrences("ramasuryanarayana");
        int[] n = {0,1,0,1,5,8,5,9,2,5,4,5};
        findDuplicateInArray(n);
    }

    public static void findNoOfOccurrences(String s){

        Map<String,Integer> map = new HashMap<>();

        String[] sArray = s.split(" ");
        for(String st:sArray){
            if(map.containsKey(st)){
                map.put(st,map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() +" = "+entry.getValue());
        }
        System.out.println("*********************************");
    }

    public static void findNumberOfCharOccurrences(String s){

        Map<Character, Integer> map1 = new HashMap<>();

        char[] cArray = s.toCharArray();

        for(char c:cArray){
            if(map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else {
                map1.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> entry:map1.entrySet()){
            System.out.println(entry.getKey() +" = "+entry.getValue());
        }
    }

    public static void findDuplicateInArray(int[] n){

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i:n){
            if(!set.contains(i)){
                set.add(i);
            }else {
                duplicates.add(i);
            }
        }
        System.out.println("Duplicate numbers :"+duplicates);
        System.out.println("numbers :"+set);
    }

}
