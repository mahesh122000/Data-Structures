public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[]=new long[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextLong();
	 int k=s.nextInt();
	 long sum=Long.MIN_VALUE;
	 long add=0;
	 for(int i=0;i<k;i++)
	 add+=a[i];
	 long pre=0;
	 long m=Long.MAX_VALUE;
	 sum=Math.max(sum,add);
	 for(int i=k;i<n;i++)
	 {add+=a[i];
	 sum=Math.max(sum,add);
	 pre+=a[i-k];
	 m=Math.min(m,pre);
	 sum=Math.max(sum,add-m);
	 }
	 if(n==1)
	 System.out.println(a[0]);
	 else
	 System.out.println(sum);
	 }}