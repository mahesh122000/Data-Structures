    ArrayList<Integer>al;
    int findK(int A[][], int n, int m, int k)
    {
        al=new ArrayList<>();
        print(A,0,0,n,m);
        return al.get(k-1);
    }
    void print(int a[][],int i,int j,int n,int m)
    {
        if(i>=n || j>=m)
        return ;
        for(int p=j;p<m;p++)
        al.add(a[i][p]);
        for(int p=i+1;p<n;p++)
        al.add(a[p][m-1]);
        if(n-1 !=i)
        {for(int p=m-2;p>=j;p--)
        al.add(a[n-1][p]);
        }
        if(m-1 !=j)
        {for(int p=n-2;p>i;p--)
        al.add(a[p][j]);
        }
        print(a,i+1,j+1,n-1,m-1);
    }