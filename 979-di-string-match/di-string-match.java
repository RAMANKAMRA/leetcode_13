class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length(), left = 0, right = n;
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D')
                arr[i] = right--;
            else
                arr[i] = left++;
        }
        arr[n] = right;
        return arr;
    }
}