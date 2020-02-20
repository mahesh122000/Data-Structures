public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {String c=s.next();
	 int n=c.length();
	 int a[]=new int[256];
	 int max=1;
	 int left=0,count=0;
	 for(int right=0;right<n;right++)
	 {++a[c.charAt(right)];
	 if(a[c.charAt(right)]>1)
	 {while(c.charAt(right)!=c.charAt(left))
	 {a[c.charAt(left)]--;
	 left++;}
	 a[c.charAt(left)]--;
	 left++;
	 }
	 else
	 max=Math.max(max,right-left+1);}
	 System.out.println(max);
	 }
	 }