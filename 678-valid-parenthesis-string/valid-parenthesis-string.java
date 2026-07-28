class Solution {
    public boolean checkValidString(String s) {
        int high=0;
        int low=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                high++;
                low++;

            }else if(ch==')'){
                high--;
                low--;
            }else{
                high++;
                low--;

            }
            if(high<0)return false;
            low=Math.max(low,0);
        }
        return low==0;
        
    }
}