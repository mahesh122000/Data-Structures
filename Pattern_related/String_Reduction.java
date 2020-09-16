static int stringReduction(String s) {
        int n=s.length();
        int a[]=new int[3];
        for(char c:s.toCharArray())
        {
            a[c-'a']++;
        }
        if(a[0]==0 && a[1]==0)
        return a[2];
        if(a[0]==0 && a[2]==0)
        return a[1];
        if(a[1]==0 && a[2]==0)
        return a[0];
        if(a[0]%2==a[1]%2 && a[0]%2==a[2]%2)
        return 2;
        return 1;
    }

// if all are same chars the Len will the ans.
//if all frequencies are same that is odd or even then we end with 2 else with 1