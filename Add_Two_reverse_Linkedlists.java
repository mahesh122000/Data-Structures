 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String c1="";
        String c2="";
        ListNode temp=l1;
        while(temp!=null)
        {c1=c1+String.valueOf(temp.val);
        temp=temp.next;}
        temp=l2;
        while(temp!=null)
        {c2=c2+String.valueOf(temp.val);
        temp=temp.next;}
        String c3=reverse(c1);
        String c4=reverse(c2);
        String c5=add(c3,c4);
        int k=c5.length();
        int i=0;
        ListNode t=new ListNode(Integer.parseInt(c5.substring(i,i+1)));
        l1=t;
        i++;
        while(i<k)
        {
         ListNode tt=new ListNode(Integer.parseInt(c5.substring(i,i+1)));
            t.next=tt;
            t=tt;
            i++;
        }
        return l1;}
    public static String reverse(String a)
    {int n=a.length();
    String b="";
    for(int i=n-1;i>=0;i--)
     b+=a.substring(i,i+1);
    return b;}
    public static String add(String a,String b)
    {
        String c="";
        int n=a.length();
        int m=b.length();
        int ad=0;
        int min=Math.min(n,m);
        for(int i=1;i<=min;i++)
        {int k=Integer.parseInt(a.substring(n-i,n-i+1))+Integer.parseInt(b.substring(m-i,m-i+1));
        k+=ad;
        ad=k/10;
        int r=k%10;
        c=c+String.valueOf(r);}
        
        if(min==n)
        {for(int i=min+1;i<=m;i++)
        {int k=Integer.parseInt(b.substring(m-i,m-i+1));
        k+=ad;
        ad=k/10;
        int r=k%10;
        c=c+String.valueOf(r);}
        if(ad!=0)
            c=c+String.valueOf(ad);
         }
        else
        {for(int i=min+1;i<=n;i++)
        {int k=Integer.parseInt(a.substring(n-i,n-i+1));
        k+=ad;
        ad=k/10;
        int r=k%10;
        c=c+String.valueOf(r);}
        if(ad!=0)
            c=c+String.valueOf(ad);}
        return c;
        }
    }