class GfG
{ static int i; 
	void printPostOrder(int in[], int pre[], int n)
	{
		i=0;
		print(in,pre,0,n-1);
	}
	void print(int a[],int b[],int l,int r)
	{if(l>r)
	return;
	if(l==r)
	System.out.print(b[i++]+" ");
	else
	{int t=b[i++];
	int k=-1;
	for(int j=l;j<=r;j++)
	{if(a[j]==t)
	{k=j;break;}}
	print(a,b,l,k-1);
	print(a,b,k+1,r);
	System.out.print(t+" ");}
}}