class solve{
    public static boolean kColorable(List<Integer>[] G , int[] color, int i, int C){
	    for(int j=0;j<color.length;j++)
	    {if(!find(G,color,j,C))
	    return false;}
	    return true;
	    }
	    public static boolean find(List<Integer>[] G , int[] color, int i, int C)
	    {if(i==color.length)
	    return true;
	    for(int j=1;j<=C;j++)
	    {if(isSafe(G[i],color,j))
	    {color[i]=j;
	    if(find(G,color,i+1,C))
	    return true;
	    color[i]=0;
	    }
	    }
	    return false;
	}
	public static boolean isSafe(List<Integer>l,int a[],int n)
	{
	   for(Integer i:l)
	   {if(a[i]==n)
	   return false;}
	   return true;
	}
}