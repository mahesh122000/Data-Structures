 public int find(int a[],int n,int max)
    {
        Stack<int[]>st=new Stack<>();
        int j=0;
        for(int i=0;i<=n;i++)
	    {for(j=i;!st.isEmpty() && a[i]<=a[st.peek()[0]];)
	    {int x[]=st.pop();
	    j=x[1];
	    max=Math.max(max,a[x[0]]*(i-j));}
	    st.push(new int []{i,j});}
        return max;
    }
    public int maxArea(int a[][], int m, int n) {
        int b[]=new int[n+1];
        int max=0;
        for(int j=0;j<m;j++)
        {for(int i=0;i<n;i++)
        {if(a[j][i]==0)
        b[i]=0;
        else
        b[i]++;
        }
            max=find(b,n,max);
           // System.out.println(max);
        }
    return max;}