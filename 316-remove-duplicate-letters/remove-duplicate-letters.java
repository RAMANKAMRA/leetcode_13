class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] vis = new boolean[26];


        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--; 

    
            if (vis[ch - 'a']) continue;

  
            while (!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0) {
                vis[st.peek() - 'a'] = false;
                st.pop();
            }

            st.push(ch);
            vis[ch - 'a'] = true;
        }

     
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}