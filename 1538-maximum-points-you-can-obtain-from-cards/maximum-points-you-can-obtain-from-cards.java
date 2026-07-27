class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftsum=0;
        int rightsum=0;
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        max=leftsum;
        for(int i=0;i<k;i++){
            leftsum-=cardPoints[k-1-i];
            rightsum+=cardPoints[cardPoints.length-1-i];
            sum=leftsum+rightsum;
            max=Math.max(max,sum);

        }
       
        return max;

        
    }
}