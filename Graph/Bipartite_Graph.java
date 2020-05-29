class GfG
{
	  boolean isBipartite(int g[][],int n)
       {
          int a[]=new int[n];
          int b[]=new int[n];
          for(int i=0;i<n;i++)
          {b[i]=1;
          for(int j=0;j<n;j++)
          {if(g[i][j]==1)
          {if(b[j]==0)
          {a[j]=a[i]^1;}
          else
          {if(a[i]==a[j])
          return false;}}}}
          return true;
        }
}