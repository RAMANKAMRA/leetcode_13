import java.util.*;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            long spell=spells[i];
            long minpotion=(success+spell-1)/spell;
            int index=lowerBound(potions,minpotion);
            ans[i]=m-index;
        }
        return ans;

    
        
    }
    private int lowerBound(int arr[],long target){
        int left=0,right=arr.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}