class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int currsum=0;
        int totalsum=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            currsum+=satisfaction[i];
            if(currsum<0)break;
            totalsum+=currsum;
        }
        return totalsum;

        
    }
}