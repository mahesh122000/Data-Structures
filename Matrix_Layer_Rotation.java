public class Solution {
    public static void find(long a[][],int i,int j,int n,int m,long r)
    {ArrayList<Long>al=new ArrayList<>();
    if(i>=n || j>=m)
    return ;
    for(int p=j;p<m;p++)
    al.add(a[i][p]);
    for(int p=i+1;p<n;p++)
    al.add(a[p][m-1]);
    if(n-1 !=i)
    {for(int p=m-2;p>=j;p--)
    al.add(a[n-1][p]);}
    if(m-1 !=j)
    {for(int p=n-2;p>i;p--)
    al.add(a[p][j]);}
    calc(a,i,j,n,m,r,al);
    find(a,i+1,j+1,n-1,m-1,r);
    }
    public static void calc(long a[][],int i,int j,int n,int m,long r,ArrayList<Long>al)
    {
        int k=al.size();
        if(k==0)
        return ;
        int g=(int)r%k;
        long b[]=new long[k];
        for(int p=0,q=g;q<k;p++,q++)
        b[p]=al.get(q);
        for(int p=k-g,q=0;q<g;p++,q++)
        b[p]=al.get(q);
        g=0;
        for(int p=j;p<m;p++)
        {a[i][p]=b[g];
        g++;}
        for(int p=i+1;p<n;p++)
        {a[p][m-1]=b[g];
        g++;}
        if(n-1 !=i)
        {for(int p=m-2;p>=j;p--)
        {a[n-1][p]=b[g];
        g++;}}
        if(m-1 !=j)
        {for(int p=n-2;p>i;p--)
        {a[p][j]=b[g];
        g++;}}
    }

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        long r=s.nextLong();
        long a[][]=new long[n][m];
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        a[i][j]=s.nextLong();}
        find(a,0,0,n,m,r);
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        System.out.print(a[i][j]+" ");
        System.out.println();}
    }        
    }
    