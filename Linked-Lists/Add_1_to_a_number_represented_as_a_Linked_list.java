class GfG{
	public Node addOne(Node head){
            Node temp=head;
            int i=0;
           while(temp!=null)
           {i++;temp=temp.next;}
           int a[]=new int[i];
           Node temp1=head;
           while(--i!=-1)
           {a[i]=temp1.data;
           temp1=temp1.next;}
           int k=0;
           for(int j=0;j<a.length;j++)
           {k=k*10;
               k=k+a[j];}
               k++;
              int n=k;
              i=0;
              while(n>0)
              {i++;
              n=n/10;}
              int b[]=new int[i];
              while(--i!=-1)
              {b[i]=k%10;
              k=k/10;}
              Node temp2=new Node(b[0]);
              head=temp2;
              for(int j=1;j<b.length;j++)
              {temp2.next=new Node(b[j]);
              temp2=temp2.next;}
           
         return head;
}}