class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxdist=0;
        for(int i=0;i<n;i++){
        if(colors[i]!=colors[0]){
            maxdist=Math.max(maxdist,i);
        }
        if(colors[i]!=colors[n-1]){
            maxdist=Math.max(maxdist,n-i-1);
        }
        }
        return maxdist;
        
    }
}