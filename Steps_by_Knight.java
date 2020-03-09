import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    private static final int[] rowx = {2, 2,-2,-2,-1,1, 1,-1};
    private static final  int[] coly ={1,-1, 1,-1, 2,2,-2,-2};

    static class pair{
        int x,y;
        public pair(){

        }
        public pair(int x , int y){
            this.x =x;
            this.y =y;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while (t-->0){
            int n = s.nextInt();
            int srx = s.nextInt();
            int sry = s.nextInt();
            int dex =s.nextInt();
            int dey = s.nextInt();
            int[][] dis = new int[n+1][n+1];
            for (int i =1; i<=n ; i++){
                for(int j =1; j<=n ; j++){
                    dis[i][j] = Integer.MAX_VALUE;
                }
            }
            bfs(n,dis, srx,sry,dex,dey);
            if(dis[dex][dey] != Integer.MAX_VALUE){
                System.out.println(dis[dex][dey] +" ");
            }
            else {
                System.out.println(-1);
            }
        }
    }
    private static void bfs(int n, int[][] dis, int srx, int sry, int dex, int dey) {
        Queue<pair> q = new LinkedList<>();
        dis[srx][sry] = 0;
        q.add(new pair(srx,sry));
        while (!q.isEmpty()){
            pair p = q.poll();
            for(int i=0; i<8; i++){
                int adx = p.x + rowx[i];
                int ady = p.y + coly[i];

                if(adx>=1 && ady>=1 && adx<=n && ady<=n && dis[adx][ady] > dis[p.x][p.y]+1){
                    dis[adx][ady] = dis[p.x][p.y]+1;
                    q.add(new pair(adx,ady));
                }
            }
        }
    }
}