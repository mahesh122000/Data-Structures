class Solution {
    ListNode create(ArrayList<Integer>al)
    {
        ListNode head=null;
        for(int n:al)
        {if(head==null)
        {head=new ListNode(n);}
        else
        {ListNode r=new ListNode(n);
        r.next=head;
        head=r;}}
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer>a1=new ArrayList<>();
        ArrayList<Integer>a2=new ArrayList<>();
        while(l1!=null)
        {a1.add(0,l1.val);
        l1=l1.next;}
        while(l2!=null)
        {a2.add(0,l2.val);
        l2=l2.next;}
        int ad=0;
        int i=0;
        if(a1.size()>=a2.size())
        {
            while(i<a2.size())
            {int k=a1.get(i)+a2.get(i)+ad;
            if(k>=10)
                ad=1;
             else 
                 ad=0;
            k=k%10;
            a1.set(i,k);
            i++;}
            while(i<a1.size())
            {int k=a1.get(i)+ad;
            if(k>=10)
                ad=1;
             else 
                 ad=0;
            k=k%10;
            a1.set(i,k);
            i++;}
            if(ad==1)
                a1.add(1);
            return create(a1);
        }
        else
        {
            while(i<a1.size())
            {int k=a1.get(i)+a2.get(i)+ad;
            if(k>=10)
                ad=1;
             else 
                 ad=0;
            k=k%10;
            a2.set(i,k);
            i++;}
            while(i<a2.size())
            {int k=a2.get(i)+ad;
            if(k>=10)
                ad=1;
             else 
                 ad=0;
            k=k%10;
            a2.set(i,k);
            i++;}
            if(ad==1)
                a2.add(1);
            return create(a2);
        }
    }
}