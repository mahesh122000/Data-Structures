static long winningLotteryTicket(String[] tickets) {
    Map<Integer, Long> fm = new HashMap<Integer, Long>();
    long ret = 0;       
    for(String s:tickets)
    {
        char[] c = s.toCharArray();
        int[] n = new int[10];
        for(char c1:c)
            n[c1-'0'] = 1;
        int f = 0;
        for(int i=0;i<n.length;i++)
            if(n[i]==1)
            f = f + (int)(Math.pow(2, n.length-1-i));
        fm.put(f, fm.getOrDefault(f, 0L)+1L);
    }
    Integer[] I = fm.keySet().toArray(new Integer[fm.size()]);   
    for(int i=0;i<I.length;i++)
        for(int j=i+1;j<I.length;j++)
            if( ((I[i]|I[j] )^1023 ) ==0 )
                ret = ret + (fm.get(I[i]) * fm.get(I[j]));

  if(fm.containsKey(1023))
  ret = ret + ( (fm.get(1023) * (fm.get(1023)-1)) / 2);

    return ret;
    }