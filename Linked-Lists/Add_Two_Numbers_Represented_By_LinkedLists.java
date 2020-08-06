class Solution{
    static Node reverse(Node root)
    {
        if(root==null)
        {
            return root;
        }
        Node s=null;
        while(root!=null)
        {
            if(s==null)
            {
                s=new Node(root.data);
            }
            else
            {
                Node n=new Node(root.data);
                n.next=s;
                s=n;
            }
            root=root.next;
        }
        return s;
    }
    static Node addLists(Node first, Node second){
       Node n=reverse(first);
       Node m=reverse(second);
       Node ans=null;
       int ad=0;
       while(n!=null && m!=null)
       {
           if(ans==null)
           {
               ans=new Node(n.data+m.data+ad);
               if(ans.data>=10)
               {
                   ans.data%=10;
                   ad=1;
               }
               else
               {
                   ad=0;
               }
           }
           else
           {
               Node no=new Node(n.data+m.data+ad);
               if(no.data>=10)
               {
                   no.data%=10;
                   ad=1;
               }
               else
               {
                   ad=0;
               }
               no.next=ans;
               ans=no;
           }
           n=n.next;
           m=m.next;
       }
       while(n!=null)
       {
           Node no=new Node(n.data+ad);
               if(no.data>=10)
               {
                   no.data%=10;
                   ad=1;
               }
               else
               {
                   ad=0;
               }
               no.next=ans;
               ans=no;
               n=n.next;
       }
       while(m!=null)
       {
           Node no=new Node(m.data+ad);
               if(no.data>=10)
               {
                   no.data%=10;
                   ad=1;
               }
               else
               {
                   ad=0;
               }
               no.next=ans;
               ans=no;
               m=m.next;
       }
       if(ad!=0)
       {
           Node no=new Node(1);
           no.next=ans;
           ans=no;
       }
       return ans;
    }
}