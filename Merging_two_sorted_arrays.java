public static int merge(int a[],int b[],int n)
     {int c[]=new int[2*n];
     int i=0,j=0;
     for(int k=0;k<2*n;k++)
     {
     if(i==n && j<n)
     {c[k]=b[j];
     j++;}
     else if(j==n && i<n)
     {c[k]=a[i];
     i++;}
     else if(i<n && a[i]<=b[j])
     {c[k]=a[i];
     i++;}
     else if(j<n && a[i]>=b[j])
     {c[k]=b[j];
     j++;}
     }
     return c[n]+c[n-1];
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 for(int i=0;i<n;i++)
	 b[i]=s.nextInt();
	 System.out.println(merge(a,b,n));
	 }
	 }