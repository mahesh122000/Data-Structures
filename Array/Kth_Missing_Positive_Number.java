class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=1;
        int count=0;
        for(int i:arr)
        {
            int j=i-l;
            int pre=count;
            count+=j;
            if(count>k)
            {
                return l+(k-pre)-1;
            }
            else if(count==k)
                return i-1;
            l=i+1;
        }
        return l+(k-count)-1;
    }
}