class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) return true;

        int m = flowerbed.length;

        for (int i = 0; i < m; i++) {

            boolean left = (i == 0) || (flowerbed[i - 1] == 0);
            boolean right = (i == m - 1) || (flowerbed[i + 1] == 0);

            if (flowerbed[i] == 0 && left && right) {
                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}