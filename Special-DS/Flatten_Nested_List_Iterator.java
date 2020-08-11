/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    ArrayList<Integer>al;
    int ind;
    public NestedIterator(List<NestedInteger> nestedList) {
        al=new ArrayList<>();
        ind=0;
        fill(nestedList);
    }

    @Override
    public Integer next() {
        if (!hasNext()) 
            return null;
        return al.get(ind++);
    }

    @Override
    public boolean hasNext() {
        return al.size()>ind;
    }
    
    void fill(List<NestedInteger>l)
    {
        for(NestedInteger n:l)
        {
            if(n.isInteger())
            {
                al.add(n.getInteger());
            }
            else
            {
                fill(n.getList());
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */