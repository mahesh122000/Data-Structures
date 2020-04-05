public static void main (String[] args)throws Exception
	 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-- > 0)
	    {int n=Integer.parseInt(br.readLine().trim());
	    String s[]=br.readLine().split(" ");
	    long a[]=new long[n];
	    long ans[]=new long[n];
	    for(int i=0;i<n;i++)
	            a[i]=Long.parseLong(s[i]);
	 Stack<Integer>st=new Stack<>();
	 st.push(0);
	 for(int i=1;i<n;i++)
	 {if(a[st.peek()]>a[i])
	 st.push(i);
	 else
	 {while(!st.isEmpty()&&a[st.peek()]<a[i])
	 {ans[st.peek()]=a[i];
	 st.pop();
	 }
	 st.push(i);
	 }}
	 while(!st.isEmpty())
	 {ans[st.peek()]=-1;
	 st.pop();
	 }
	 for(int i=0;i<n;i++)
	 System.out.print(ans[i]+" ");
	 System.out.println();
	 }
	 }