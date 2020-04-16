 public boolean checkValidString(String s) {
        Stack<Integer>st=new Stack<>();
        Stack<Integer>sta=new Stack<>();
        int count=0;
        one:for(int i=0;i<s.length();i++)
        {char c=s.charAt(i);
        if(c=='(')
         st.push(i);
         else if(c=='*')
         sta.push(i);
         else
         {
             if(st.isEmpty())
             {if(sta.isEmpty())
             {return false;}
             else
              sta.pop();}
             else
                 st.pop();
         }
        }
        System.out.println(st.size()+" "+count);
        while(!st.isEmpty()&& !sta.isEmpty())
        {if(st.peek()>sta.peek())
            return false;
        st.pop();
        sta.pop();}
        if(!st.isEmpty())
            return false;
        return true;
    }