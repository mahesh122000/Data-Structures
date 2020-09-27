class Solution {
    public int minSwapsCouples(int[] row) {
        int ans=0;
        int n=row.length;
        int pos[]=new int[n];
        for(int i=0;i<n;i++)
            pos[row[i]]=i;
        for(int i=0;i<n/2;i++)
        {
            int c1=row[2*i];
            int c2=row[2*i+1];
            if((c1%2==0 && c1+1==c2)||(c1%2==1 && c2==c1-1))
            {}
            else
            {
                int index=(c1%2==0)?pos[c1+1]:pos[c1-1];
                ans++;
                swap(row,pos,2*i+1,index);
            }
        }
        return ans;
    }
    void swap(int row[],int pos[],int source,int target)
    {
        int temp=row[source];
        row[source]=row[target];
        row[target]=temp;
        pos[row[source]]=source;
        pos[row[target]]=target;
    }
}