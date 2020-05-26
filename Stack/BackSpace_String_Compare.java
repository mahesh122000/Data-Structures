public boolean backspaceCompare(String S, String T) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<S.length();i++)
        {char c=S.charAt(i);
        if(c=='#')
        {if(st.isEmpty())
        {}
        else
         st.pop();}
        else
         st.add(c);}
        Stack<Character>stt=new Stack<>();
        for(int i=0;i<T.length();i++)
        {char c=T.charAt(i);
        if(c=='#')
        {if(stt.isEmpty())
        {}
        else
         stt.pop();}
        else
         stt.add(c);}
        if(st.size()!=stt.size())
            return false;
        while(!st.isEmpty() && !stt.isEmpty())
        {if(st.peek()==stt.peek())
        {st.pop();
        stt.pop();}
        else
         return false;}
        if(!st.isEmpty()||!stt.isEmpty())
            return false;
        return true;
    }