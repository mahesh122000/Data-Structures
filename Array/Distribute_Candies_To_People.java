class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n=num_people;
        int a[]=new int[n];
        int cur=1;
        int i=0;
        while(candies>0)
        {
            i%=n;
            if(cur<candies)
            {
                a[i]+=cur;
                candies-=cur;
                cur++;
                i++;
            }
            else
            {
                a[i]+=candies;
                candies=0;
                break;
            }
        }
        return a;
    }
}