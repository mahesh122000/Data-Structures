import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class Node
    {
        int x,y;
        int distance=0;
       Node(int a, int b,int c)
       {
           x=a;y=b;
           distance=c;
       }
    }
    static boolean safe(int i, int j,int row,int col)
    {
        if(i<0 || j<0 || i>=row || j>=col) return false;
        return true;
    }
    static int find(int mat[][], int a, int b,int row,int col)
    {
        Node n = new Node(a,b,0);
        Queue<Node> q = new LinkedList<Node>();
        q.add(n);
        int min=Integer.MAX_VALUE;
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            int i=temp.x;
            int j=temp.y;
            int dis=temp.distance;
            if(mat[i][j]==1)
            {
                return dis;
            }
            if(safe(i+1,j,row,col)) {
                q.add(new Node(i+1,j,dis+1));
            }
            if(safe(i-1,j,row,col)){
                q.add(new Node(i-1,j,dis+1));
            }
            if(safe(i,j+1,row,col)){
                q.add(new Node(i,j+1,dis+1));
            }
            if(safe(i,j-1,row,col)){
                q.add(new Node(i,j-1,dis+1));
            }
        }
        return -1;
    }

    static void print(int mat[][],int n,int m)
    {
        StringBuffer s = new StringBuffer();
        for(int i=0 ;i<n; i++)
        {
            for(int j=0; j<m ;j++)
            {
                s.append(mat[i][j]+" ");
            }
        }
        System.out.println(s);
    }

	public static void main (String[] args) throws Exception 
	 {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine().trim());
		for(int m=0; m<testcases; m++)
		{
		    String[] line= br.readLine().split(" ");
		     int row=Integer.parseInt(line[0]);
		     int col=Integer.parseInt(line[1]);
		    String[] line2 = br.readLine().split(" ");
		    int cnt=0;
		    int mat[][] = new int[row][col];
		    for(int i=0; i<row; i++)
		    {
		        for(int j=0; j<col; j++)
		        {
		            mat[i][j]=Integer.parseInt(line2[cnt++]);
		        }
		    } 
		    int res[][] = new int[row][col];
		    for(int i=0; i<row; i++)
		    {
		        for(int j=0; j<col; j++)
		        {
		            res[i][j]=find(mat,i,j,row,col);
		        }
		    }
		    print(res,row,col);
		}
	 }
}
