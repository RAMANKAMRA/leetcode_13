class Solution {
    public int minimumRounds(int[] tasks) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:tasks){
            map.put(x,map.getOrDefault(x,0)+1);
       
        }
             for(int freq :map.keySet()){
                if(map.get(freq)==1){
                    return -1;
                }else{
                    count+=map.get(freq)/3;
                    if(map.get(freq)%3!=0)count++;

                }

            }
        return count;
      

        
    }
}