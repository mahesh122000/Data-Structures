import java.io.*;
import java.util.*;
class Main
{
  static class Node { 
        int data; 
        Node left, right; 
  
        public Node(int item) { 
            data = item; 
            left = right = null; 
        } 
    } 
    static Node insert(Node temp, int key) 
    { 
        if(temp==null)
        {
          temp=new Node(key);
          return temp;
        }
        Node n=temp;
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(temp); 
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.left == null) { 
                temp.left = new Node(key); 
                break; 
            } else
                q.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node(key); 
                break; 
            } else
                q.add(temp.right); 
        } 
      return n;
    } 
  static void find(Node root,int i)
  {
    if(root==null)
      return ;
    //System.out.println(root.data+" ");
    if(hm.containsKey(i))
    {
      int k=hm.get(i);
      hm.put(i,k+root.data);
    }
    else
    {
      al.add(i);
      hm.put(i,root.data);
    }
    find(root.left,i-1);
    find(root.right,i+1);
  }
  static ArrayList<Integer>al;
  static HashMap<Integer,Integer>hm;
  public static void main(String argc[])
  {
    Scanner s=new Scanner(System.in);
    Node root=null;
    al=new ArrayList<>();
    hm=new HashMap<>();
    while(true)
    {
      int k=s.nextInt();
      if(k<0)
        break;
      root=insert(root,k);
    }
    //System.out.println(root.data+" ");
      System.out.println("The column wise sum values"); 
      System.out.println("C.No : sum ");
      find(root,0);
      Collections.sort(al);
      for(Integer i:al)
      {
        System.out.println(i+" : "+hm.get(i));
      }
  }
}
    