class GfG
{
    public static Node pairwiseSwap(Node node)
    {
        
       Node temp=node;
       while(temp!=null)
       {if(temp.next!=null)
       {int k=temp.data;
       temp.data=temp.next.data;
       temp.next.data=k;
       temp=temp.next;
       temp=temp.next;
       }
       else
       break;}
    return node;}}