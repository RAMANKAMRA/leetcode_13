class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        int[] scount=new int[100];
        int[] gcount=new int[100];
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                bulls++;
            }else{
                scount[s-'0']++;
                gcount[g-'0']++;
            }
        }
        for(int i=0;i<100;i++){
            cows+=Math.min(scount[i],gcount[i]);
        }
        return bulls + "A" + cows + "B";

        
    }
}