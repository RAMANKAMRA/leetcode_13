import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

      
        HashSet<Integer> freqSet = new HashSet<>(mp.values());

      
        return freqSet.size() == 1;
    }
}
