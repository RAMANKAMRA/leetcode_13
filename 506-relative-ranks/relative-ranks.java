class Solution {
    class Pair{
        int score,index;
        Pair(int s,int i){
            score = s;
            index = i;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.score - a.score);

        for(int i=0;i<n;i++) pq.add(new Pair(score[i],i));

        String[] ans = new String[n];

        for(int i=0;i<n;i++){
            Pair p = pq.poll();
            if(i==0) ans[p.index] = "Gold Medal";
            else if(i==1) ans[p.index] = "Silver Medal";
            else if(i==2) ans[p.index] = "Bronze Medal";
            else ans[p.index] = i+1+"";
        }

        return ans;
    }
}