class Solution {
    static HashSet<Integer>hs;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        hs=new HashSet<>();
        int n=rooms.size();
        find(rooms,0);
        return hs.size()==n;
    }
    void find(List<List<Integer>> rooms,int i)
    {
        hs.add(i);
        for(Integer j:rooms.get(i))
        {
            if(!hs.contains(j))
                find(rooms,j);
        }
    }
}