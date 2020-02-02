void compute(LinkedList l)
    {
        Stack<Integer>st=new Stack<Integer>();
        Node temp=l.head;
        while(temp!=null)
        {if(st.isEmpty() || st.peek()>temp.data)
        {st.push(temp.data);
        temp=temp.next;}
        else
        {while(!st.isEmpty() && st.peek()<temp.data)
        {st.pop();}
        st.push(temp.data);
        temp=temp.next;}}
        Node t=new Node(st.peek());
        st.pop();
        while(!st.isEmpty())
        {Node tt=new Node(st.peek());
        tt.next=t;
        t=tt;
        st.pop();}
        l.head=t;
        while(l.head!=null)
        {System.out.print(l.head.data+" ");
        l.head=l.head.next;}
    }