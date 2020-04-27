class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        return find(nums,0,n-1);
    }
    public int find(int a[],int l,int r)
    {
        int m=(l+r)>>1;
        if(l==r)
            return a[l];
        if(a[l]==a[r])
            return Math.min(find(a,l,m),find(a,m+1,r));
        else if(a[m]>a[r])
            return find(a,m+1,r);
        return find(a,l,m);
    }
    
}