import java.io.*;
import java.math.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[][] a=find(n);
            for(int i=0;i<n-1;i++)
            {for(int j=0;j<n-1;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
            }
    }
    static int[][] find(int n) {
    int[][] a = new int[n-1][n-1];
    for (int i=1;i<n;i++) {
        for (int j=1;j<n;j++) {
            if (a[j-1][i-1] != 0) {
                a[i-1][j-1] = a[j-1][i-1];
                continue;
            }
            if (a[i-1][j-1] == 0) {
                a[i-1][j-1] = move(n, i, j);
            }}}
    return a;
    }

private static int move(int n, int a, int b) {
    int[] rd = new int[] {b, a,  b,  a, -a, -b, -a, -b};
    int[] cd = new int[] {a, b, -a, -b,  b,  a, -b, -a};

    int[][] visit = new int[n][n];
    int er = n-1;
    int ec = n-1;

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] {0, 0, 0});
    visit[0][0] = 1;
    while(!q.isEmpty()) {
        int[] cur = q.remove();
        if (cur[0] == er && cur[1] == ec) 
            return cur[2];
        for (int i = 0; i < 8; i++) {
            int nr = rd[i] + cur[0];
            int nc = cd[i] + cur[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n && visit[nr][nc] == 0) {
                q.add(new int[] {nr, nc, cur[2] + 1}); 
                visit[nr][nc] = 1;       
            }}}
    return -1;
}
}
