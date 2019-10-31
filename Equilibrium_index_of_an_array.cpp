int findEquilibrium(int a[], int n)
{
 int sum=0,sum1=0;
 for(int i=0;i<n;i++)
 sum+=a[i];
 int j=-1;
 for(int i=0;i<n;i++)
 {sum1+=a[i];
 if(sum1==sum)
 {j=i;break;}
 sum-=a[i];}
 return j;
}