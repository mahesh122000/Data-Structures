public static void rearrange(Node odd)
    {
        Stack<Integer>st=new Stack<>();
        Node temp=odd;
        while(temp.next!=null && temp.next.next!=null)
        {if(temp.next!=null)
        {st.push(temp.next.data);
        temp.next=temp.next.next;
        temp=temp.next;
        }}
        if(temp.next!=null)
        temp=temp.next;
        while(!st.isEmpty())
        {Node no=new Node(st.peek());
        st.pop();
        temp.next=no;
        temp=no;}
       // return odd;
    }