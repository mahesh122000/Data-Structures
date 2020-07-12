class Solution {

    static int n,m;
    static Random rand;
    static int total;
    static HashSet<Integer>hs;
    public Solution(int n_rows, int n_cols) {
       this.n=n_rows;
       this.m=n_cols;
       this.total=n*m;
       this.hs=new HashSet<>();
       rand=new Random(); 
    }
    
    public int[] flip() {
        int x=rand.nextInt(total);
        while(hs.contains(x))
        {
            x=rand.nextInt(total);
        }
        hs.add(x);
        return new int[]{x/m,x%m};
    }
    
    public void reset() {
        this.hs.clear();
    }
}