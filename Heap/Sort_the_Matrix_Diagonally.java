class Solution {
    public int[][] diagonalSort(int[][] a) {
        int n=a.length;
        if(n==0)
            return a;
        int m=a[0].length;
        if(m==0)
            return a;
        int i=n-1,j=0;
        while(i>=0)
        {   
            ArrayList<Integer>al=new ArrayList<>(); 
            int p=i,q=j;
            while(p<n && q<m)
            {
                al.add(a[p][q]);
                p++;
                q++;
            }
            Collections.sort(al);
            p=i;q=j;
            while(p<n && q<m && al.size()>=1)
            {
                a[p][q]=al.get(0);
                al.remove(0);
                p++;
                q++;
            }
            i--;
        }
        i=0;j=m-1;
        while(j>=0)
        {   
            ArrayList<Integer>al=new ArrayList<>(); 
            int p=i,q=j;
            while(p<n && q<m)
            {
                al.add(a[p][q]);
                p++;
                q++;
            }
            Collections.sort(al);
            p=i;q=j;
            while(p<n && q<m && al.size()>=1)
            {
                a[p][q]=al.get(0);
                al.remove(0);
                p++;
                q++;
            }
            j--;
        }
        return a;
    }
}