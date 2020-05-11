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
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<m;j++)
	     a[i][j]=s.nextInt();}
	     int x=s.nextInt();
	     int y=s.nextInt();
	     if(a[x][y]==0 || a[0][0]==0)
	     System.out.println("-1");
	     else
	     System.out.println(find(a,x,y));
	 }
	 }
	 public static int find(int a[][],int p,int r)
	 {
	     int n=a.length;
	     int m=a[0].length;
	     Queue<int[]>q=new LinkedList<>();
	     int b[][]=new int[n][m];
	     q.add(new int[]{0,0,0});
	     b[0][0]=1;
	     while(!q.isEmpty())
	     {int x[]=q.poll();
	     if(x[0]==p && x[1]==r)
	     return x[2];
	     b[x[0]][x[1]]=1;
	     if(x[0]-1>=0 && a[x[0]-1][x[1]]==1 && b[x[0]-1][x[1]]==0)
	     {q.add(new int[]{x[0]-1,x[1],x[2]+1});}
	     if(x[1]-1>=0 && a[x[0]][x[1]-1]==1 && b[x[0]][x[1]-1]==0)
	     {q.add(new int[]{x[0],x[1]-1,x[2]+1});}
	     if(x[0]+1<n && a[x[0]+1][x[1]]==1 && b[x[0]+1][x[1]]==0)
	     {q.add(new int[]{x[0]+1,x[1],x[2]+1});}
	     if(x[1]+1<m && a[x[0]][x[1]+1]==1 && b[x[0]][x[1]+1]==0)
	     {q.add(new int[]{x[0],x[1]+1,x[2]+1});}
	     }
	     return -1;
	 }
}