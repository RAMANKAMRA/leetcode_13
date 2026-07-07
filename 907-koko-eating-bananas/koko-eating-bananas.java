class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        // int max=0;
        // for(int pile:piles){
        //     max=Math.max(max,pile);

        // }
        // for(int speed=1;speed<=max;speed++){
        //     long hours=0;
        //     for(int pile:piles){
        //         hours+=(pile+speed-1)/speed;
        //     }
        //     if(hours<=h){
        //         return speed;
        //     }


        // }
        // return max;
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }

        while(low<high){
            int mid=low+(high-low)/2;
            long hours=0;
            for(int pile:piles){
                hours+=(pile+mid-1)/mid;
                
            }
            if(hours<=h){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}