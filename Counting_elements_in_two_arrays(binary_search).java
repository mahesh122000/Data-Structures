public static int find(int a[],int l,int h,int x)
    {
        while(l<=h)
        {
        int m=(l+h)/2;
        if(a[m]<=x)
        l=m+1;
        else
        h=m-1;}
        return l;
    }
    public static void countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
      Arrays.sort(arr2);
      for(int i=0;i<arr1.length;i++)
      {System.out.print(find(arr2,0,arr2.length-1,arr1[i])+" ");}
    }