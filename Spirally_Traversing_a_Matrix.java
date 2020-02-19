public static void print(int a[][],int i,int j,int n,int m)
    {
        if(i>=n || j>=m)
        return ;
        for(int p=j;p<m;p++)
        System.out.print(a[i][p]+" ");
        for(int p=i+1;p<n;p++)
        System.out.print(a[p][m-1]+" ");
        if(n-1 !=i)
        {for(int p=m-2;p>=j;p--)
        System.out.print(a[n-1][p]+" ");}
        if(m-1 !=j)
        {for(int p=n-2;p>i;p--)
        System.out.print(a[p][j]+" ");}
        print(a,i+1,j+1,n-1,m-1);
    }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int m=s.nextInt();
	 int a[][]=new int[n][m];
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<m;j++)
	 a[i][j]=s.nextInt();}
	 print(a,0,0,n,m);
	 System.out.println();
	 }
	 }