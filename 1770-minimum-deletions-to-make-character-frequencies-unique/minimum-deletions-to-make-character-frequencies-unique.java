import java.util.*;

class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Integer> used = new HashSet<>();
        int deletions = 0;

        for (int freq : map.values()) {
            while (freq > 0 && used.contains(freq)) {
                freq--;         
                deletions++;   
            }
            used.add(freq);
        }

        return deletions;
    }
}
