static void powerSet(String str) 
	{
	    char c[]=str.toCharArray();
	    Arrays.sort(c);
		generate(new String(c),str.length(),-1,"");
	} 
	static void generate(String s,int n,int i,String c)
	{if(n==i)
	return ;
	if(c=="")
	{}
	else
	System.out.print(c+" ");
	for(int j=i+1;j<n;j++)
	{c+=s.charAt(j);
	generate(s,n,j,c);
	c=c.substring(0,c.length()-1);
	}
	}