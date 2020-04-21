 ListNode t;
    Random ran;
    public Solution(ListNode head) {
        t=head;
        ran=new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int ans=-1;
        ListNode temp=t;
        int i=1;
        while(temp!=null)
        {if(ran.nextInt(i)+1==i++)
         ans=temp.val;
        temp=temp.next;}
        return ans;
    }