class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[n];
        int prev_time=0;
        for(String s:logs)
        {
            String c[]=s.split(":");
            int a=Integer.parseInt(c[0]);
            int b=Integer.parseInt(c[2]); 
          //  System.out.println(a+" "+c[1]+" "+b);
            if(c[1].equals("start"))
            {
                if(!st.isEmpty())
                {
                    int k=st.peek();
                    ans[k]+=b-prev_time-1;
                }
                st.push(a);
            }
            else
            {
                int x=st.pop();
                assert x==a;
                ans[a]+=b-prev_time+1;
            }
            prev_time=b;
        }
        return ans;
    }
}


