class Solution {
    public int minAddToMakeValid(String S) {
        int count1=0,count2=0;
        for(char c:S.toCharArray())
        {
            if(c=='(')
                count1++;
            else
            {
                if(count1==0)
                    count2++;
                else
                    count1--;
            }
        }
        return count1+count2;
    }
}