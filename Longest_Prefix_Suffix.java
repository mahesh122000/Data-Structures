public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {String a=s.next();
	 int n=a.length();
	 int count=0;
	 for(int i=0;i<n-1;i++)
	 {if(a.substring(0,i+1).equals(a.substring(n-i-1,n)))
	 {count=i+1;}}
	 System.out.println(count);
	 }}