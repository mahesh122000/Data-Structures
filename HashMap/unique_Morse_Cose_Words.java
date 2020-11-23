class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String>hs=new HashSet<>();
        for(String s:words)
        {
            String str="";
            for(char c:s.toCharArray())
            {
                str+=arr[c-'a'];
            }
            hs.add(str);
        }
        return hs.size();
    }
}