class RandomizedCollection {
     List<Integer> list;
    Map<Integer, Set<Integer>> map;
    java.util.Random rand = new java.util.Random();
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        list = new ArrayList<>();
        map = new HashMap<Integer, Set<Integer>>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if(! map.containsKey(val)){
            map.put(val, new HashSet<>());
        }
        map.get(val).add(list.size());
        list.add(val);
        return map.get(val).size() == 1;
            
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(! map.containsKey(val) || map.get(val).size() == 0)
            return false;
        int index = map.get(val).iterator().next();
        
        map.get(val).remove(index);
        
        int last_element = list.get(list.size() - 1);
        list.set(index, last_element);
        
        map.get(last_element).add(index);
        map.get(last_element).remove(list.size() - 1);
        
        list.remove(list.size() - 1);
        
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}