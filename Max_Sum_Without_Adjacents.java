public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[]=new long[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextLong();
	 if(n==1)
	 System.out.println(a[0]);
	 else
	 {long b[]=new long[n];
	 b[0]=a[0];
	 b[1]=Math.max(a[0],a[1]);
	 for(int i=2;i<n;i++)
	 {b[i]=Math.max(b[i-1],a[i]+b[i-2]);}
	 System.out.println(b[n-1]);}
	 }
	 }