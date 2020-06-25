static int c=0;
    public int pairs(Node root){
        int a[]=new int[100001];
        inorder(root,a);
        int b[]=new int[c];
        return merge(a,0,c-1,b);
    }
    void inorder(Node root,int a[])
    {
        if(root==null)
        return ;
        inorder(root.left,a);
        a[c++]=root.data;
        inorder(root.right,a);
    }
    int merge(int a[],int start,int end,int b[])
    {
        if(start>=end)
        return 0;
        int mid=(start+end)>>1;
        int val=0;
        val+=merge(a,start,mid,b);
        val+=merge(a,mid+1,end,b);
        val+=find(a,start,mid,end,b);
        return val;
    }
    int find(int a[],int start,int mid,int end,int b[])
    {
        int c=start,i=start,j=mid+1;
        int val=0;
        while(i<=mid && j<=end)
        {
            if(a[i]<=a[j])
            {
                b[c++]=a[i++];
            }
            else
            {
                val+=mid+1-i;
                b[c++]=a[j++];
            }
        }
        while(i<=mid)
        {
            b[c++]=a[i++];
        }
        while(j<=end)
        {
            b[c++]=a[j++];
        }
        for(int k=start;k<=end;k++)
        a[k]=b[k];
        return val;
    }