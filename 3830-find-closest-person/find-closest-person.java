class Solution {
    public int findClosest(int x, int y, int z) {
        int diff = Math.abs(x - z);
        int diff2 = Math.abs(y - z);
        
        if (diff < diff2) {
            return 1;
        } else if (diff2 < diff) {
            return 2;
        } else {
            return 0;
        }
    }
}
