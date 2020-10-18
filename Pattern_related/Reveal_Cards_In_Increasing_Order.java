class Solution {
    public int[] deckRevealedIncreasing(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        Arrays.sort(a);
        b[0]=a[0];
        int i=1,j=1;
        int count=0;
        while(i<n)
        {
            if(b[j%n]==0)
                count++;
            if(count==2)
            {
                b[j%n]=a[i++];
                count=0;
            }
            j++;
        }
        return b;
    }
}