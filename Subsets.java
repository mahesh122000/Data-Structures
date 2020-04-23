static ArrayList<ArrayList<Integer>>al;
    static HashSet<ArrayList<Integer>>hs;
    public static void printAllSubsets(int arr[], int n){
        hs=new HashSet<>();
        al=new ArrayList<>();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {l.add(arr[i]);
        find(l,arr,n,i);
        l.remove(l.size()-1);
        }
        for(ArrayList<Integer>ll:al)
        {System.out.print("(");
        for(int i=0;i<ll.size()-1;i++)
        System.out.print(ll.get(i)+" ");
        System.out.print(ll.get(ll.size()-1)+")");
        }
    }
    public static void find(ArrayList<Integer>l,int a[],int n,int i)
    {
        if(i<n)
        {ArrayList<Integer>ll=(ArrayList<Integer>)l.clone();
        if(hs.contains(ll))
        {}
        else
        {al.add(ll);
        hs.add(ll);
        }}
        if(i>n)
        return;
        for(int j=i+1;j<n;j++)
        {
            l.add(a[j]);
            find(l,a,n,j);
            l.remove(l.size()-1);
        }
    }