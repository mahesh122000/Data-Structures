class Solution {
    public boolean validateStackSequences(int[] a, int[] b) {
        int n=a.length;
        if(n==0)
            return true;
        HashSet<Integer>hs=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        int i=0,j=0;
        while(i<=n && j<n)
        {
            int k=b[j];
            if(hs.contains(k))
            {
                if(st.peek()==k)
                    st.pop();
                else
                    return false;
                j++;
                continue;
            }
            while(i<n && a[i]!=k)
            {
                st.add(a[i]);
                hs.add(a[i]);
                i++;
            }
            if(i<n && a[i]==k)
            {st.add(a[i]);
             hs.add(a[i]);
             i++;}
            
        }
        return true;
    }
}