import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
       static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
     
     
	public static void main (String[] args)
	 {
	 FastReader s=new FastReader();
	 int t=s.nextInt();
	 int n=10001;
	 long aa[]=new long[n];
	 PriorityQueue<Long>pq=new PriorityQueue<>();
	     HashSet<Long>hs=new HashSet<>();
	     pq.add((long)1);
	     int k=1;
	     hs.add((long)1);
	     while(k<n)
	     {
	     long a=pq.poll();
	     aa[k]=a;
	     k++;
	     if(hs.contains(a*2)==false)
	     {pq.add(a*2);
	     hs.add(a*2);}
	     if(hs.contains(a*3)==false)
	     {pq.add(a*3);hs.add(a*3);}
	     if(hs.contains(a*5)==false)
	     {pq.add(a*5);hs.add(a*5);}
	     }
	 while(t-->0)
	 {
	     int nn=s.nextInt();
	     System.out.println(aa[nn]);
	 }
	 }
}