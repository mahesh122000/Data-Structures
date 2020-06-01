ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer>al=new ArrayList<>();
        int a[]=new int[n];
        int b[]=new int[n];
        a[0]=arr.get(0);
        for(int i=1;i<n;i++)
        {if(arr.get(i)<a[i-1])
        a[i]=arr.get(i);
        else
        a[i]=a[i-1];
        }
        b[n-1]=arr.get(n-1);
        for(int i=n-2;i>=0;i--)
        {
            if(arr.get(i)>b[i+1])
            b[i]=arr.get(i);
            else
            b[i]=b[i+1];
        }
        for(int i=0;i<n;i++)
        {if(a[i]==arr.get(i)|b[i]==arr.get(i))
        {}
        else
        {if(a[i]<arr.get(i) && arr.get(i)<b[i])
        {al.add(a[i]);
        al.add(arr.get(i));
        al.add(b[i]);
        return al;}
        }}
        return al;
    }