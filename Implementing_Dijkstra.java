class Solution
{
    static void dijkstra(ArrayList<ArrayList<Integer>> list, int src, int V)
    {
        int a[]=new int[V];
        int b[]=new int[V];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[src]=0;
        for(int i=0;i<V;i++)
        {int u=find(list,a,b,V);
        b[u]=1;
        for(int j=0;j<V;j++)
        {if(b[j]==0 && list.get(u).get(j)!=0 && a[u]!=Integer.MAX_VALUE)
        a[j]=Math.min(a[j],a[u]+list.get(u).get(j));
        }
        }
        for(int i=0;i<V;i++)
        System.out.print(a[i]+" ");
    }
    static int find(ArrayList<ArrayList<Integer>> list, int a[],int b[], int V)
    {
        int min=Integer.MAX_VALUE;
        int i=-1;
        for(int j=0;j<V;j++)
        {if(min>a[j] && b[j]==0)
        {min=a[j];
        i=j;}}
        return i;
    }
}
