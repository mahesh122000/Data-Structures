class TopVotedCandidate {
    HashMap<Integer,Integer>hm;
    ArrayList<Integer>al;
    ArrayList<Integer>bl;
    public TopVotedCandidate(int[] persons, int[] times) {
        hm=new HashMap<>();
        al=new ArrayList<>();
        bl=new ArrayList<>();
        int max=0;
        int val=0;
        for(int i=0;i<persons.length;i++)
        {
            hm.put(persons[i],hm.getOrDefault(persons[i],0)+1);
            if(max<=hm.get(persons[i]))
            {
                val=persons[i];
                max=hm.get(persons[i]);
            }
            al.add(times[i]);
            bl.add(val);
        }
    }
    
    public int q(int t) {
        int k=Collections.binarySearch(al,t);
        System.out.print(k+" ");
        if(k<0)
            k=-k-2;
        return bl.get(k);
    }
}

