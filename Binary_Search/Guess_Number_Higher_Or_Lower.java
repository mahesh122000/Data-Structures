public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,h=n;
        while(l<=h)
        {
            int m=h+(l-h)/2;
            int k=guess(m);
           // System.out.println(k+" "+m);
            if(k>0)
                l=m+1;
            else if(k<0)
                h=m-1;
            else
                return m;
        }
        return -1;
    }
}