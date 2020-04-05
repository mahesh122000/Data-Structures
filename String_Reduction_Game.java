static String findWinner(String s) 
	{ 
	Stack<Character>st=new Stack<>();
	int count=0;
	int n=s.length();
	st.add(s.charAt(0));
	for(int i=1;i<n;i++)
	{
	if(!st.isEmpty() && st.peek()==s.charAt(i))
	{st.pop();
	count++;
	}
	else
	{st.add(s.charAt(i));
	}
	}
	if(count%2==0)
	return "Pippin";
	else
	return "Merry";
	}