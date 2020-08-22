class Solution {
    int a[];
    int b[][];
    int sum=0;
    Random r;
    public Solution(int[][] rects) {
        a=new int[rects.length];
        for(int i=0;i<rects.length;i++)
        {
            a[i]=sum;
            sum+=(rects[i][2]-rects[i][0]+1)*(rects[i][3]-rects[i][1]+1);
        }
        b=rects;
        r=new Random();
    }
    
    public int[] pick() {
        int k=r.nextInt(sum);
        int ind=Arrays.binarySearch(a,k);
        if(ind<0)
        {
            ind=-ind-1;
            if(ind>0)
                ind--;
        }
        int x=r.nextInt(b[ind][2]-b[ind][0]+1)+b[ind][0];
        int y=r.nextInt(b[ind][3]-b[ind][1]+1)+b[ind][1];
        return new int[]{x,y};
    }
}