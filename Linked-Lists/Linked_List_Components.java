class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer>hs=new HashSet<>();
        for(Integer i:G)
            hs.add(i);
        int ans=0;
        while(head!=null)
        {
            if(hs.contains(head.val))
            {
                ans++;
                while(head!=null && hs.contains(head.val))
                {
                    hs.remove(head.val);
                    head=head.next;
                }
            }
            else
            {
                head=head.next;
            }
        }
        return ans;
    }
}