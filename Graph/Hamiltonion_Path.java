class GFG
 {
     static ArrayList<ArrayList<Integer>>al;
     static int b[];
     static ArrayList<Integer>l;
     static int ans;
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     al=new ArrayList<>();
	     int v=s.nextInt();
	     b=new int[n+1];
	     ans=0;
	     l=new ArrayList<>();
	     for(int i=0;i<=n;i++)
	     al.add(new ArrayList<>());
	     for(int i=0;i<v;i++)
	     {
	         int p=s.nextInt();
	         int q=s.nextInt();
	         al.get(p).add(q);
	         al.get(q).add(p);
	     }
	     for(int i=1;i<=n;i++)
	     {find(i,n);
	     if(ans==1)
	     break;
	     }
	     System.out.println(ans);
	 }
	 }
	 static void find(int i,int n)
	 {
	     l.add(i);
	     b[i]=1;
	     if(l.size()==n)
	     {ans=1;
	     return;}
	     for(Integer j:al.get(i))
	     {if(b[j]==0)
	     find(j,n);
	     }
	     b[i]=0;
	     l.remove(l.size()-1);
	 }
}