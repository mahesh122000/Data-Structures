import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        String s = br.readLine();
	        char c[]=s.toCharArray(); 
	        String ans="";
	        HashSet<Character>hs=new HashSet<>();
	        for(int i=0;i<c.length;i++)
	        {
	            char a=c[i];
	            if((a>='A' && a<='Z')||(a>='a' && a<='z'))
	            a=Character.toLowerCase(a);
	            if(hs.contains(a))
	            {
	                hs.remove(a);
	            }
	            else
	            {
	                ans+=c[i];
	                hs.add(a);
	            }
	        }
	        System.out.println(ans);
	    }
	 }
}