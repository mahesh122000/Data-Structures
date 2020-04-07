void linkdelete(struct Node  *head, int M, int N)
{
    int n=N,m=M;
        Node* temp=head;
        if(head==NULL)
        return ;
        
        while(--m && temp!=NULL)
        {temp=temp->next;}

        
        while(n-- && temp!=NULL && temp->next!=NULL)
        {
            if(temp->next!=NULL)
            {temp->next=temp->next->next;}
        }
        //f(temp->next!=NULL)
        //cout<<temp->next->data<<endl;
        if(temp!=NULL && temp->next!=NULL)
        linkdelete(temp->next,M,N);
}