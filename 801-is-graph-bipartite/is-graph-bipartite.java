class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];  

        for (int i = 0; i < n; i++) {
            if(color[i]==0){

                if (dfs(i, 1, color, graph)) {
                    return false;   
                }
            }
        }
        

        return true;  
    }


    private boolean dfs(int node, int c, int[] color, int[][] graph) {

        color[node] = c;  

        for (int neigh : graph[node]) {

            if (color[neigh] == 0) {  
                
                if (dfs(neigh, -c, color, graph)) {
                    return true;   
                }
            }
            else if (color[neigh] == color[node]) {
                return true;       
            }
        }

        return false;  
    }
}
