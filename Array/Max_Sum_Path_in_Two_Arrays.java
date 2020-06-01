int maxPathSum(int ar1[], int ar2[])
    {
        int ans=0;
        int i=0,j=0;
        int s1=0,s2=0;
        while(i<ar1.length && j<ar2.length)
        {
            if(ar1[i]<ar2[j])
            s1+=ar1[i++];
            else if(ar1[i]>ar2[j])
            s2+=ar2[j++];
            else if(ar1[i]==ar2[j])
            {ans+=Math.max(s1,s2);
            s1=0;
            s2=0;
            ans+=ar1[i];
            i++;
            j++;
            }
        }
        while(i<ar1.length)
        s1+=ar1[i++];
        while(j<ar2.length)
        s2+=ar2[j++];
        ans+=Math.max(s1,s2);
        return ans;
    }