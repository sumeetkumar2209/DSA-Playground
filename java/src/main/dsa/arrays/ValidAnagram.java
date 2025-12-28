package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

// https://neetcode.io/problems/is-anagram/question

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            int val = map.getOrDefault(ch, 0) + 1;
            map.put(ch, val);
        
        }

        for (char ch : t.toCharArray()) {
            int val = map.getOrDefault(ch, 0) - 1;
            if (val < 0) {
                return false;
            } else if (val == 0) {
                map.remove(ch);
            } else {
                 map.put(ch, val);
            }
        }   

        return map.size() == 0;
    }

    public static void main(String[] args) {
        
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram")); // true
        System.out.println(validAnagram.isAnagram("rat", "car")); // false
    }
    
    
}
