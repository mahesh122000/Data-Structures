class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
         List<List<Integer>> al = new ArrayList<>(N + 1);
        for(int i = 0; i <= N; i++) al.add(new ArrayList<Integer>());
        for(int[] d : dislikes){
            al.get(d[0]).add(d[1]);
            al.get(d[1]).add(d[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        int[] b = new int[N + 1];
        Arrays.fill(b, -1);
        for(int i = 1; i < N + 1; i++){
            if(b[i] == -1){
                b[i] = 0;
                q.offer(i);
                while(!q.isEmpty()){
                    int u = q.poll();
                    for(int v : al.get(u)){
                        if(b[v] == -1){
                            b[v] = (b[u] == 0 ? 1 : 0);
                            q.offer(v);
                        }
                        else if(b[v] == b[u]){
                            return false;
                        }
        }}}}
        return true;
    }
}