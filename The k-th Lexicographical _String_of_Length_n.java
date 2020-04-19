class Solution {
    public String getHappyString(int n, int k) {
        char a[]=new char[n];
        for(int i=0;i<n;i++)
        {if(i%2==0)
         a[i]='a';
        else
         a[i]='b';}
        int j=n-1;
        return change(a,j,1,k);
    }
    public String change(char a[],int j,int i,int k)
    {
    if(i==k)
    return new String(a);
    if(j<=-1)
    return "";
    if(j==0)
    {a[j]=(char)(a[j]+1);
    build(a,j);
    i++;
     if(a[j]=='d')
         return "";
    return change(a,a.length-1,i,k);}
    else
    {if(a[j]=='c')
    {return change(a,j-1,i,k);}
    else
    {if(a[j-1]=='a')
    {
    a[j]='c';
    build(a,j);
    }
     else if(a[j-1]=='b')
     {
     a[j]='c';
     build(a,j);
     }
     else
     {if(a[j]=='b')
         return change(a,j-1,i,k);
      a[j]=(char)(a[j]+1);}
    i++;
    build(a,j);
    return change(a,a.length-1,i,k);
    }}
   }
     
    public void build(char a[],int i)
    {for(int j=i+1;j<a.length;j++)
    {if(a[j-1]!='a')
     a[j]='a';
    else if(a[j-1]=='a')
        a[j]='b';}}
}