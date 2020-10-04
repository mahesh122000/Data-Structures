class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(i!=j && check(intervals[i],intervals[j]))
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
                count++;
        }
        return count;
    }
    boolean check(int a[],int b[])
    {
        if(b[0]<=a[0] && a[1]<=b[1])
            return true;
        return false;
    }
}