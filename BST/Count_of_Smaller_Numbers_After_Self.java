class Solution {
    class Node
    {
        int count;
        int val;
        Node left;
        Node right;
        Node(int i)
        {
            this.val=i;
            this.count=1;
            this.left=null;
            this.right=null;
        }
    }
    int add(Node head,int i)
    {
        if(head.val<i)
        {
            if(head.right==null)
            {head.right=new Node(i);
             return head.count;}
            else
                return head.count+add(head.right,i);
        }
        else
        {
            head.count++;
            if(head.left==null)
            {head.left=new Node(i);
            return 0;}
            else
                return add(head.left,i);
        }
    }
    
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        if(n==0)
            return l;
        Node head=new Node(nums[n-1]);
        l.add(0,0);
        for(int i=n-2;i>=0;i--)
        {
            int v=add(head,nums[i]);
            l.add(0,v);
        }
        return l;
    }
}




 