class GFG
{int i=0;
    Node constructTree(int n, int pre[], char preLN[])
    {
	   if(i>=n)
	   return null;
	   Node no=new Node(pre[i]);
	   while(preLN[i]=='N')
	   {i++;
	       no.left=constructTree(n,pre,preLN);
	   i++;
	   no.right=constructTree(n,pre,preLN);
	   if(i>=n)
	   break;
	   
	   }
	   return no;
    }
}