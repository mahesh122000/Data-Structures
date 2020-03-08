class Solution {
    public int numTimesAllBlue(int[] light) {
        int n=light.length;
        HashSet<Integer>hs=new HashSet<>();
        int count=0;
        HashSet<Integer>hss=new HashSet<>();
        for(int i=0;i<n;i++)
        {int k=light[i];
        if(k==1)
        {hs.add(1);
         while(true)
         {k++;
          if(hss.contains(k))
          {hs.add(k);
          hss.remove(k);}
          else
              break;}
         if(hss.size()==0)
        count++;}
         else if(k==2 && hss.contains(1))
         {if(hss.size()==0)
             count++;
         hs.add(1);
         hs.add(2);
         hss.remove(1);
         while(true)
         {k++;
          if(hss.contains(k))
          {hs.add(k);
          hss.remove(k);}
          else
              break;}}
         else if(hs.contains(k-1))
        {hs.add(k);
         while(true)
         {k++;
          if(hss.contains(k))
          {hs.add(k);
          hss.remove(k);}
          else
              break;}
         if(hss.size()==0)
        count++;}
        else
        {hss.add(k);}}
        return count;
    }
}