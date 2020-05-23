class RandomizedSet {
    static HashSet<Integer>hs;
    static Random rand;
    static ArrayList<Double>al;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        al=new ArrayList<>();
        hs=new HashSet<>();
        rand=new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!hs.contains(val))
        {al.add((double)val);
        hs.add(val);
        return true;}
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hs.contains(val))
        {hs.remove(val);
        al.remove((double)val);
        return true;}
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        if(al.size()==0)
            return -1;
        int k=rand.nextInt(al.size());
        int val=al.get(k).intValue();
        return val;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */