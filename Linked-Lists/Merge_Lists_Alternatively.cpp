void mergeList(struct Node **p, struct Node **q)
{
     Node *h1=*p;
     Node *h2=*q;
     while(h1->next && h2)
     {
         Node *t=h1->next;
         h1->next=h2;
         h2=h2->next;
         h1->next->next=t;
         h1=h1->next->next;
     }
     if(h2)
     {
         h1->next=h2;
         *q=h2->next;
         h2->next=NULL;
     }
     else
     *q=NULL;
}