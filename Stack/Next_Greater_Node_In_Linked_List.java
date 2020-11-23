class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer>al=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int i=0;
        while(head!=null)
        {
            int k=head.val;
            al.add(k);
            while(!st.isEmpty() && al.get(st.peek())<k)
            {
                al.set(st.peek(),k);
                st.pop();
            }
            st.add(i++);
            head=head.next;
        }
        while(!st.isEmpty())
        {
            al.set(st.peek(),0);
            st.pop();
        }
        int l=al.size();
        int a[]=new int[l];
        for(int j=0;j<l;j++)
            a[j]=al.get(j);
        return a;
    }
}