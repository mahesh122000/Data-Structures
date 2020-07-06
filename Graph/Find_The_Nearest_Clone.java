import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static ArrayList<ArrayList<Integer>>al;
    static boolean vis[];
    static int findShortest(int n, int[] f, int[] t, long[] c, long val) {
        al=new ArrayList<>();
        vis=new boolean[n+1];
        al.add(new ArrayList<>());
        int count=0;
        for(int i=1;i<=n;i++)
        {
            al.add(new ArrayList<>());
            if(c[i-1]==val)
            count++;
        }
        if(count<2)
        return -1;
        for(int i=0;i<f.length;i++)
        {
            al.get(f[i]).add(t[i]);
            al.get(t[i]).add(f[i]);
        }
        int ans=n;
        for(int i=0;i<c.length;i++)
        {
            int sum=0;
            if(c[i]==val)
            {
                sum=find(i+1,val,c);
                ans=Math.min(ans,sum);
            }
        }
        return ans;
    }
    static int find(int i,long val,long c[]) {
        ArrayList<Integer>l=al.get(i);
        vis[i]=true;
        int min=c.length;
        for(Integer j:l)
        {
            int sum=1;
            if(vis[j]==true)
            continue;
            if(c[j-1]==val)
            return sum; 
            sum+=find(j,val,c);
            min=Math.min(sum,min);
        }
        return min;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] graphNodesEdges = scanner.nextLine().split(" ");
        int graphNodes = Integer.parseInt(graphNodesEdges[0].trim());
        int graphEdges = Integer.parseInt(graphNodesEdges[1].trim());

        int[] graphFrom = new int[graphEdges];
        int[] graphTo = new int[graphEdges];

        for (int i = 0; i < graphEdges; i++) {
            String[] graphFromTo = scanner.nextLine().split(" ");
            graphFrom[i] = Integer.parseInt(graphFromTo[0].trim());
            graphTo[i] = Integer.parseInt(graphFromTo[1].trim());
        }

        long[] ids = new long[graphNodes];

        String[] idsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < graphNodes; i++) {
            long idsItem = Long.parseLong(idsItems[i]);
            ids[i] = idsItem;
        }

        long val = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int ans = findShortest(graphNodes, graphFrom, graphTo, ids, val);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}




