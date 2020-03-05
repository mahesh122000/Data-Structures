class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {List<Integer>l=new ArrayList<>();
         if(i==0)
             l.add(1);
         else
         {l.add(1);
         for(int j=1;j<=i-1;j++)
         {l.add(al.get(i-1).get(j-1)+al.get(i-1).get(j));}
          l.add(1);}  
         al.add(l);
        }
        return al;
    }
}