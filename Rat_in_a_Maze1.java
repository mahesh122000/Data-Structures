class GfG{
     public static ArrayList<String> printPath(int[][] m, int n)
     {
          ArrayList<String>al=new ArrayList<>();
          int b[][]=new int[n][n];
          String ans="";
          if(m[0][0]==0)
          return al;
          find(0,0,m,n,b,ans,al);
          Collections.sort(al);
          return al;
     }
     public static void find(int i,int j,int a[][],int n,int b[][],String s,ArrayList<String>al)
     {if(i==n-1 && j==n-1)
     {al.add(s);
         return ;
     }
     else if(i>=n || j>=n)
     return;
     else
     {b[i][j]=1;
         if(i+1<n && b[i+1][j]==0 && a[i+1][j]==1)
         find(i+1,j,a,n,b,s+"D",al);
         if(j+1<n && b[i][j+1]==0 && a[i][j+1]==1)
         find(i,j+1,a,n,b,s+"R",al);
         if(i-1>=0 && b[i-1][j]==0 && a[i-1][j]==1)
         find(i-1,j,a,n,b,s+"U",al);
         if(j-1>=0 && b[i][j-1]==0 && a[i][j-1]==1)
         find(i,j-1,a,n,b,s+"L",al);
     b[i][j]=0;
     }
     }