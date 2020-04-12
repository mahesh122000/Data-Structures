static void maxMeetings(int start[], int end[], int n)
    {
        int a[][]=new int[n][3];
        if(n==0)
        return ;
        for(int i=0;i<n;i++)
        {a[i][0]=start[i];
        a[i][1]=end[i];
        a[i][2]=i+1;
        }
        int count=1;
        Arrays.sort(a,(p,q)->p[1]-q[1]);
        int k=a[0][1];
        System.out.print(a[0][2]+" ");
        for(int i=0;i<n;i++)
        {if(a[i][0]>=k)
            {System.out.print(a[i][2]+" ");
            k=a[i][1];}
        }
    }