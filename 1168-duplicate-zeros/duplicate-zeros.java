class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
            Queue<Integer>q=new LinkedList<>();
         for(int num:arr){
            q.add(num);
            if(num==0){
                q.add(0);
            }
         }
        for(int i=0;i<n;i++){
            arr[i]=q.poll();
        }
        
    }
}