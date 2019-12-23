void printKdistance(Node root, int k)
     {
          if(root!=null && k==0)
          {System.out.print(root.data+" ");}
          else if((root==null) || (k<0))
          {return ;}
          else
          {
          printKdistance(root.left,k-1);
          printKdistance(root.right,k-1);}
     }