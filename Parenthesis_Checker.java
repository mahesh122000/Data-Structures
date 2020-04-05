public static void main (String[] args)
	 {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{String c=s.next();
	if(c.length()==0)
	System.out.println("balanced");
	else
	{Stack<Character>st=new Stack<>();
	st.push(c.charAt(0));
	boolean flag=true;
	for(int i=1;i<c.length();i++)
	{if(!st.isEmpty())
	{char cc=st.peek();
	char ss=c.charAt(i);
	if((cc=='(' && ss==')')||(cc=='{' && ss=='}')||(cc=='['&& ss==']'))
	st.pop();
	else if(ss=='('||ss=='{'||ss=='[')
	{st.add(ss);
	}
	else
	break;
	}
	else
	{char ss=c.charAt(i);
	if(ss=='('||ss=='{'||ss=='[')
	st.add(c.charAt(i));
	else
	{flag=false;break;}
	}
	}
	if(st.isEmpty()&&flag)
	System.out.println("balanced");
	else
	System.out.println("not balanced");
	 }}
	 }