public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 int max=a[0];
	 int count=1;
	 for(int i=1;i<n;i++)
	 {if(a[i]>=max)
	 {max=a[i];
	 count++;}
	 }
	 System.out.println(count);}
	 }