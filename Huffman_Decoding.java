void decode(String s, Node root) {
        String c="";
        Node temp=root;
        int i=0;
        for(i=0;i<s.length();i++)
        {char d=s.charAt(i);
        if(d=='0')
        {temp=temp.left;}
        else
        {temp=temp.right;}
        if(temp.left==null && temp.right==null)
            {System.out.print(temp.data);temp=root;}
        }
   
    }