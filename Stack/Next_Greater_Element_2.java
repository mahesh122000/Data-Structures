class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        if(n==0)
            return new int[]{};
        int ans[]=new int[n];
        int max=Integer.MIN_VALUE,ind=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                ind=i;
            }
        }
        Stack<Integer>st=new Stack<>();
        for(int i=ind+1,j=0;j<n;i++,j++)
        {
            i=i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[i])
            {
                ans[st.peek()]=nums[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.peek()]=-1;
            st.pop();
        }
        return ans;
    }
}