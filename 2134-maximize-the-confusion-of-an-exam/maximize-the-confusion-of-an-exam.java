class Solution {

    public int maxConsecutiveAnswers(String answerKey, int k) {

        return Math.max(
                solve(answerKey, k, 'T'),
                solve(answerKey, k, 'F'));
    }

    public int solve(String s, int k, char target) {

        int left = 0;
        int replace = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) != target)
                replace++;

            while (replace > k) {

                if (s.charAt(left) != target)
                    replace--;

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}