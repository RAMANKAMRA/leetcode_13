class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            int freqA=map.get(a),freqB=map.get(b);
            if(freqA!=freqB){
                return freqA-freqB;
            }else{
                return b.compareTo(a);
            }
        });
        for(String word:map.keySet()){
            pq.add(word);
            if(pq.size()>k)pq.poll();
        }
   LinkedList<String>result=new LinkedList<>();
   while(!pq.isEmpty()){
    result.addFirst(pq.poll());
   }
   return result;
        
    }
}