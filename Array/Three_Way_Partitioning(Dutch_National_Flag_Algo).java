public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
	{
        int i=0,j=0,k=A.size()-1;
    while(j<=k)
    {
        if(A.get(j)<a)
        {int val=A.get(j);
        A.set(j,A.get(i));
        A.set(i,val);
        i++;
        j++;}
        else if(A.get(j)>b)
        {int val=A.get(j);
        A.set(j,A.get(k));
        A.set(k,val);
        k--;}
        else
        j++;
    }
    return A;
	}