class Solution {
    static int r[]={-1,0,1,0};
    static int c[]={0,-1,0,1};
    public int slidingPuzzle(int[][] a) {
        Queue<String>q=new LinkedList<>();
        HashSet<String>hs=new HashSet<>();
        int count=0;
        String cur="";
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                cur+=Integer.toString(a[i][j]);
        }
        q.add(cur);
        hs.add(cur);
        while(!q.isEmpty())
        {
            int s=q.size();
            while(s-->0)
            {
                String str=q.poll();
                if(str.equals("123450"))
                    return count;
                int ind=str.indexOf("0");
                int x=ind/3;
                int y=ind%3;
                for(int k=0;k<4;k++)
                {
                    int nx=x+r[k];
                    int ny=y+c[k];
                    if(nx>=0 && nx<2 && ny>=0 && ny<3)
                    {
                        char arr[]=str.toCharArray();
                        int index=nx*3+ny;
                        arr[ind]=arr[index];
                        arr[index]='0';
                        String temp=new String(arr);
                        if(!hs.contains(temp))
                        {
                            hs.add(temp);
                            q.add(temp);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}

