import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         String c[]=new String[n];
	         HashMap<String,ArrayList<String>>hm=new HashMap<>();
	         for(int i=0;i<n;i++)
	         c[i]=s.next();
	         for(int i=0;i<n;i++)
	         {
	             String cur="";
	             for(int j=0;j<c[i].length();j++)
	             {
	                 if(c[i].charAt(j)>='A' && c[i].charAt(j)<='Z')
	                 cur+=c[i].charAt(j);
	             }
	             for(int j=0;j<cur.length();j++)
	             {
	                 String str=cur.substring(0,j+1);
	                 if(hm.containsKey(str))
	                 hm.get(str).add(c[i]);
	                 else
	                 {
	                    ArrayList<String>al=new ArrayList<>();
	                    al.add(c[i]);
	                    hm.put(str,al);
	                 }   
	             }
	         }
	         String find=s.next();
	         if(hm.containsKey(find))
	         {
	             ArrayList<String>l=hm.get(find);
	             Collections.sort(l, new Comparator<String>() {
                 @Override
                 public int compare(String o1, String o2) {
                 StringBuilder first =new StringBuilder(),second =new StringBuilder();
                 for(int i=0;i<o1.length();i++)
                 {if(o1.charAt(i)>='A' && o1.charAt(i)<='Z')
                 first.append(o1.charAt(i));}
                 for(int i=0;i<o2.length();i++)
                 {if(o2.charAt(i)>='A' && o2.charAt(i)<='Z')
                 second.append(o2.charAt(i));}
                 return first.toString().compareTo(second.toString());
                 }
                 });
	             for(String str:l)
	             System.out.print(str+" ");
	         }
	         else
	         {
	             System.out.print("No match found");
	         }
	         System.out.println();
	     }
	 }
}




