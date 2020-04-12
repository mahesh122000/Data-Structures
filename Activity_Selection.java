static int activitySelection(int start[], int end[], int n)
    {
        int a[][]=new int[n][2];
        if(n==0)
        return 0;
        for(int i=0;i<n;i++)
        {a[i][0]=start[i];
        a[i][1]=end[i];
        }
        int count=1;
        Arrays.sort(a,(p,q)->p[1]-q[1]);
        int k=a[0][1];
        for(int i=0;i<n;i++)
        {if(a[i][0]>=k)
            {count++;
            k=a[i][1];}
        }
        return count;
    }