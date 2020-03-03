 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int left=0,right=0;
         int k=s.nextInt();
         char cc=s.next().charAt(0);
        String c=s.next();
        int n=c.length();
         HashMap<Integer,Integer>hm1=new HashMap<>();
         HashMap<Integer,Integer>hm2=new HashMap<>();
         ArrayList<Integer>al=new ArrayList<>();
         int a[]=new int[256];
         a[cc]=k;
         int count=0,ans=0;
         for(right=0;right<n;right++)
         {ans=0;
          if(--a[c.charAt(right)]>=0)
          count++;
          if(count==k)
              al.add(right);
         while(count==k)
         {ans++;
          hm1.put(right,ans);
          if(++a[c.charAt(left)]>0)
              count--;
          left++;
         }}
         count=0;
         a[cc]=k;
         right=left=n-1;
         ans=0;
         for(right=n-1;right>=0;right--)
         {
             ans=0;
             if(--a[c.charAt(right)]>=0)
                 count++;
             boolean flag=false;
             while(count==k)
             {ans++;flag=true;
             if(++a[c.charAt(left)]>0)
              count--;
             left--;}
             if(flag)
             hm2.put(left+1,ans);
         }
         ans=0;
         if(al.size()==0)
         {}
         else
         {for(Integer i:al)
             ans+=hm1.get(i)*hm2.get(i);}
         System.out.println(ans);
        }
    }