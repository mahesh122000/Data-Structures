class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String c1="";
        String c2="";
        for(String c:word1)
            c1+=c;
        for(String c:word2)
            c2+=c;
        return c1.equals(c2);
    }
}