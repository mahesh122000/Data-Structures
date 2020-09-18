class Solution {
    public boolean isRobotBounded(String s) {
        int i=0,j=0,dir=1;
        for(char c:s.toCharArray())
        {
            if(c=='G')
            {
                if(dir==1)
                    j++;
                else if(dir==2)
                    i++;
                else if(dir==3)
                    j--;
                else
                    i--;
            }
            else if(c=='L')
            {
                dir=dir==1?4:dir-1;
            }
            else
            {
                dir=dir==4?1:dir+1;
            }
        }
        return (i==0 && j==0 || dir>1);
    }
}