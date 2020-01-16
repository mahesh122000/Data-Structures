 public  void printExtremeNode(Node node)
      {
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int l=0;
        while(!q.isEmpty())
        {int s=q.size();
        l++;
        int a[]=new int[s];
        int i=0;
        while(s--!=0)
        {Node temp=q.poll();
        a[i]=temp.data;
        i++;
        if(temp.left!=null)
        q.add(temp.left);
        if(temp.right!=null)
        q.add(temp.right);}
        if(l%2==0)
        System.out.print(a[0]+" ");
        else
        System.out.print(a[a.length-1]+" ");}
      }