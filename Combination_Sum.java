static ArrayList<ArrayList<Integer>>al;
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {al=new ArrayList<>();
    HashSet<Integer>hs=new HashSet<>();
    Collections.sort(A);
    ArrayList<Integer>a=new ArrayList<>();
    for(Integer i:A)
    {if(hs.contains(i))
    {}
    else
    {a.add(i);
    hs.add(i);}
    }
    ArrayList<Integer>l=new ArrayList<>();
    for(int i=0;i<a.size();i++)
    {l.add(a.get(i));
    find(a,i,B-a.get(i),l);
    l.remove(a.get(i));}
    return al;
    }
    static void find(ArrayList<Integer>a,int i,int val,ArrayList<Integer>l)
    {if(val<0 || i==a.size())
    return ;
    if(val==0)
    {ArrayList<Integer>ll=(ArrayList<Integer>)l.clone();
    al.add(ll);
    return;}
    for(int j=i;j<a.size();j++)
    {l.add(a.get(j));
    find(a,j,val-a.get(j),l);
    l.remove(a.get(j));
    }
    }