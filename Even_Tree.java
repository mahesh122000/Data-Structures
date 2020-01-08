import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int v=s.nextInt();
    int e=s.nextInt();
    Node n[]=new Node[v];
    for(int i=0;i<v;i++)
    n[i]=new Node();
    for(int i=0;i<e;i++)
    {int p=s.nextInt();
    int q=s.nextInt();
    n[p-1].setParent(n[q-1]);}
    int ans=-1;
    for(Node nn:n)
    {if(nn.count%2==1)
    ans++;}
    System.out.println(ans);}}

class Node
{
    int count=0;
    Node parent;
    void setParent(Node parent)
    {
        this.parent=parent;
        Node ancestor=parent;
        while(ancestor!=null)
        {ancestor.count++;
        ancestor=ancestor.getParent();}
    }
    Node getParent()
    {
        return parent;
    }
}
