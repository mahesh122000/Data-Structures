class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int k=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 HashMap<Integer,Integer>hm=new HashMap<>();
	 hm.put(0,0);
	 int sum=0;
	 int max=0;
	 for(int i=0;i<n;i++)
	 {sum+=a[i];
	 if(hm.containsKey(sum-k))
	 max=Math.max(max,i+1-hm.get(sum-k));
	 if(!hm.containsKey(sum))
	 hm.put(sum,i+1);
	 }
	 System.out.println(max);
	 }
	 }
}