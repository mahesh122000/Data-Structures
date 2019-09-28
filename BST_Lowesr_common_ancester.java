public static Node lca(Node root, int v1, int v2) {
      	Node temp=root;
          if(v1>v2)
          {int t=v1;
          v1=v2;
          v2=t;}
          if(temp.data<=v2 && temp.data>=v1)
          return temp;
          else if(temp.data>=v1 && temp.data>=v2 )
          {if(temp.left!=null)
              return lca(temp.left,v1,v2);
              else
              return temp;}
          else
          {if(temp.right!=null)
              return lca(temp.right,v1,v2);
              else
              return temp;}
        
    }