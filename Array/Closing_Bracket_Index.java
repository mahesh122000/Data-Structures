class Sol
{
    int closing (String s, int pos)
    {
        int n=s.length();
        int count=0;
        for(int i=pos+1;i<n;i++)
        {
            if(count==0 && s.charAt(i)==']')
            return i;
            else if(count>0 && s.charAt(i)==']')
            count--;
            else if(s.charAt(i)=='[')
            count++;
        }
        return 0;
    }
}