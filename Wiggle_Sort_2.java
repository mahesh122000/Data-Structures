class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        if(n<=1)
            return;
        Arrays.sort(nums);
        int a[]=new int[n+1];
        int m=(n-1)>>1;
        int r=n-1;
        int i=0;
        while(m>=0||r>(n-1)>>1)
        {if(i%2==0)
        {a[i]=nums[m];
        m--;}
        else
        {a[i]=nums[r];
        r--;}
        i++;
        }
        for(i=0;i<n;i++)
        nums[i]=a[i];
    }
}