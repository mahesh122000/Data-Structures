class GFG
{
	void zigZagTraversal(Node root)
	{
	    Queue<Node>q=new LinkedList<Node>();
	    q.add(root);
	    int e=0;
	    while(!q.isEmpty())
	    {int s=q.size();
	    e++;
	    int a[]=new int[s];
	    int k=s;
	    while(s--!=0)
	    {Node temp=q.poll();
	    a[s]=temp.data;
	    if(temp.right!=null)
	    q.add(temp.right);
	    if(temp.left!=null)
	    q.add(temp.left);}
	    if(e%2==1)
	    {for(int i=0;i<k;i++)
	      System.out.print(a[i]+" ");
	    }
	    else
	    {for(int i=k-1;i>=0;i--)
	      System.out.print(a[i]+" ");
	    }}
	}
}