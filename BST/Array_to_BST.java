class GFG
 {
     static class Node
     {int data;
     Node left,right;
         Node(int val)
         {data=val;
         left=right=null;
         }
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 Node root=create(a,0,n-1,n);
	 preorder(root);
	 System.out.println();
	 }
	 }
	 public static void preorder(Node root)
	 {if(root==null)
	 return ;
	 System.out.print(root.data+" ");
	 preorder(root.left);
	 preorder(root.right);
	 }
	 public static Node create(int a[],int l,int h,int n)
	 {
	  if(l<0 || l>=n || h<0 || h>=n || l>h)
	  return null;
	  int m=(l+h)/2;
	  Node root=new Node(a[m]);
	  root.left=create(a,l,m-1,n);
	  root.right=create(a,m+1,h,n);
	  return root;
	 }
}