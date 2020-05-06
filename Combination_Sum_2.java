class Solution {
    static List<List<Integer>>al;
    static HashSet<List<Integer>>hs;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n=candidates.length;
        al=new ArrayList<>();
        hs=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(candidates);
        for(int i=0;i<candidates.length;i++)
        {l.add(candidates[i]);
            find(candidates,i+1,target-candidates[i],l);
         l.remove(l.size()-1);
        }
        if(target==0)
            al.add(l);
        return al;
    }
    public void find(int a[],int i,int v,List<Integer>l)
    {
        if(v<0)
            return ;
        else if(v==0)
        {
            List<Integer>ll=new ArrayList<>();
            ll.addAll(l);
            if(!hs.contains(ll))
            {al.add(ll);hs.add(ll);}
            return;
        }
        else
        {
            for(int j=i;j<a.length;j++)
            {l.add(a[j]);
            find(a,j+1,v-a[j],l);
            l.remove(l.size()-1);
            }
        }
    }
}