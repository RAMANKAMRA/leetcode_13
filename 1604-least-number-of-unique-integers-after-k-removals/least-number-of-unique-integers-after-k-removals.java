class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>freq=new ArrayList<>(map.values());
        Collections.sort(freq);
        int unique=freq.size();
        for(int num2:freq){
            if(k>=num2){
                k-=num2;
                unique--;
            }else{
                break;
            }
        }
        
        return unique;
    }
}