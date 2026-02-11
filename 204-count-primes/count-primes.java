class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[]ans=new boolean[n+1];
        for(int i=2;i<ans.length;i++)ans[i]=true;
        for(int i=2;i*i<=n;i++){
            if(ans[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    ans[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(ans[i]==true)count++;
        }
        return count;
    }
}