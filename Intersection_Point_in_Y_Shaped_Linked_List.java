class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
         int count1=0,count2=0;
         Node t1=headA,t2=headB;
         while(t1!=null)
         {count1++;
         t1=t1.next;}
         while(t2!=null)
         {count2++;
         t2=t2.next;}
         int k=Math.abs(count1-count2);
         if(count1>count2)
         {while(k-->0)
         {headA=headA.next;}}
         else
         {while(k-->0)
         headB=headB.next;}
         int ans=-1;
         while(headA!=null && headB!=null)
         {if(headA.data==headB.data)
         {ans=headA.data;break;}
         headA=headA.next;
         headB=headB.next;}
	return ans;}
}