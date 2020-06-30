class Solution {
    public String removeDuplicateLetters(String s) {
        int a[]=lastSeen(s);
        Stack<Character>st=find(a,s);
        return convert(st);
    }
    int[] lastSeen(String s)
    {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
            a[s.charAt(i)-'a']=i;
        return a;
    }
    Stack<Character> find(int a[],String s)
    {
        Stack<Character>st=new Stack<>();
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hs.contains(c))
                continue;
            while(!st.isEmpty() && st.peek()>c && a[st.peek()-'a']>i)
            {
                hs.remove(st.pop());
            }
            st.push(c);
            hs.add(c);
        }
        return st;
    }
    String convert(Stack<Character>st)
    {
        String ans="";
        while(!st.isEmpty())
        {
            ans=st.peek()+ans;
            st.pop();
        }
        return ans;
    }
}