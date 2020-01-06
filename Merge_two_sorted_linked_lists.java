class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
    if(headA==null && headB==null)
    return null;
    if(headA==null && headB!=null)
    return headB;
    if(headA!=null && headB==null)
    return headA;
    if(headA.data<headB.data)
    headA.next=sortedMerge(headA.next,headB);
    else
    {Node temp=headB;
    headB=headB.next;
    temp.next=headA;
    headA=temp;
    headA.next=sortedMerge(headA.next,headB);}
    return headA;
   } 
}