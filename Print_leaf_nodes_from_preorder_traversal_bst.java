public static void find(int a[],int l,int n)
    {if(l>n)
    return ;
    if(l==n)
    {System.out.print(a[l]+" ");return ;}
    int i=0;
    for(i=l;i<=n;i++)
    {if(a[i]>a[l])
    break;}
    find(a,l+1,i-1);
    find(a,i,n);
    }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 find(a,0,n-1);
	 System.out.println();
	 }
	 }