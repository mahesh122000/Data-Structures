public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    ArrayList<String>al=new ArrayList<>();
	    int n=dict.size();
	    for(int i=0;i<n;i++)
	    {String c=dict.get(i);
	    if(c.length()==pattern.length())
	    {HashMap<Character,Character>hm=new HashMap<>();
	    boolean flag=true;
	    for(int j=0;j<c.length();j++)
	    {if(hm.containsKey(pattern.charAt(j)))
	    {if(hm.get(pattern.charAt(j))==c.charAt(j))
	    {}
	    else
	    {flag=false;
	    break;}}
	    else
	    {hm.put(pattern.charAt(j),c.charAt(j));}}
	    if(flag)
	    al.add(c);}}
	return al;}