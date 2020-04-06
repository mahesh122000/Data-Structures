public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {String c=s.next();
	 Stack<char[]>st=new Stack<>();
	 int j=1;
	 for(int i=0;i<c.length();i++)
	 {if(c.charAt(i)=='(')
	 {st.push(new char[]{'(',(char)(j+'0')});
	     System.out.print(j+" ");
	     j++;
	 }
	 else if(st.isEmpty())
	 {}
	 else if(!st.isEmpty() && c.charAt(i)==')')
	 {char cc[]=st.pop();
	 System.out.print(cc[1]-'0'+" ");
	 }}
	 System.out.println();}}