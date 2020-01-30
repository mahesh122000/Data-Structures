Node removeDuplicates(Node head)
    {
         HashSet<Integer>hs=new HashSet<Integer>();
         Node temp=head;
         hs.add(temp.data);
         while(temp.next!=null)
         {if(hs.contains(temp.next.data))
         {temp.next=temp.next.next;}
         else
         {hs.add(temp.next.data);
         temp=temp.next;}}
         return head;
    }