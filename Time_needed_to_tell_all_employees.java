class Solution {
    public int time(int headId,HashMap<Integer,ArrayList<Integer>>hm,int a[],int tt)
    {
        ArrayList<Integer>al=hm.get(headId);
     
     if(al.size()==0)
     {return tt;}
    else
    {//System.out.print(al);
     tt+=a[headId];
     int max=0;
    for(Integer i:al)
    {max=Math.max(max,time(i,hm,a,tt));}
    return max;}
    }
    public int numOfMinutes(int n, int headId, int[] manager, int[] informTime) {
        HashMap<Integer,ArrayList<Integer>>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {ArrayList<Integer>al=new ArrayList<>();
         hm.put(i,al);
        }
        for(int i=0;i<manager.length;i++)
        {if(hm.containsKey(manager[i]))
        {hm.get(manager[i]).add(i);}
        else
        {ArrayList<Integer>al=new ArrayList<>();
        al.add(i);
        hm.put(manager[i],al);}}
        int tt=0;
        tt=time(headId,hm,informTime,tt);
        return tt;
    }
}