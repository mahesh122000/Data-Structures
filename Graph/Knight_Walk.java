class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int m=s.nextInt();
	     int a[][]=new int[n][m];
	     int p=s.nextInt()-1;
	     int q=s.nextInt()-1;
	     int g=s.nextInt()-1;
	     int h=s.nextInt()-1;
	     System.out.println(find(n,m,p,q,g,h));
	 }
	 }
	 static int r[]={2,2,1,1,-1,-1,-2,-2};
	 static int c[]={1,-1,2,-2,2,-2,1,-1};
	 public static int find(int n,int m,int i,int j,int p,int g)
	 {
	     int b[][]=new int[n][m];
	     Queue<int[]>q=new LinkedList<>();
	     q.add(new int[]{i,j,0});
	     while(!q.isEmpty())
	     {
	         int x[]=q.poll();
	         b[x[0]][x[1]]=1;
	         if(x[0]==p && x[1]==g)
	         return x[2];
	         for(int k=0;k<8;k++)
	         {if(safe(x[0]+r[k],x[1]+c[k],b,n,m))
	         q.add(new int[]{x[0]+r[k],x[1]+c[k],x[2]+1});
	         }
	     }
	     return -1;
	 }
	 public static boolean safe(int x,int y,int a[][],int n,int m)
	 {
	     if(x<0|y<0|x>=n|y>=m)
	     return false;
	     if(a[x][y]==1)
	     return false;
	     return true;
	 }
}