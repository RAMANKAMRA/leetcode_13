class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int res[] = new int[1001];

        for(int[] trip : trips){
            int pass = trip[0];
            int from = trip[1];
            int to = trip[2];

            res[from] += pass;
            res[to] -= pass;
        }

        for(int i = 1; i < res.length; i++){
            res[i] = res[i] + res[i - 1];
        }
         for(int i = 0; i < res.length; i++){
            
            if(res[i] > capacity){
                return false;
            }
        }
        return true;
    }
}