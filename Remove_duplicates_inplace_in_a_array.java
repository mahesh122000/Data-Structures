 public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=0;
        if(n==0)
            return l;
        int j=-1,count=1,val=nums[0];
        for(int i=1;i<n;i++)
        {if(val==nums[i])
        {count++;
        if(count>2)
        {if(j==-1)
            j=i;
         l++;
        }
        else
        {
        if(j!=-1)
        {nums[j]=val;
        j++;}}}
        else
        {count=1;
        val=nums[i];
        if(j!=-1)
        {nums[j]=val;
        j++;}}}
    return n-l;}