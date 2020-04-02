import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        int m=s.nextInt();
        HashMap<String,Long>hm=new HashMap<>();
        ArrayList<String>al=new ArrayList<>();
        for(int i=0;i<m;i++)
        {String c=s.next();
        if(c.equals("UPDATE"))
        {int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        String p=String.valueOf(x)+'$'+String.valueOf(y)+'$'+String.valueOf(z);
        long val=s.nextLong();
        if(hm.containsKey(p))
        hm.put(p,val);
        else
        {hm.put(p,val);
        al.add(p);}}
        else
        {int x1=s.nextInt();
        int y1=s.nextInt();
        int z1=s.nextInt();
        int x2=s.nextInt();
        int y2=s.nextInt();
        int z2=s.nextInt();
        long val=0;
        for(String p:al)
        {String cc[]=new String[3];
        int j=0;
        
        for(int q=0;q<p.length();q++)
        {if(p.charAt(q)=='$')
        j++;
        else
        cc[j]+=p.charAt(q);}
        
        int x=Integer.parseInt(cc[0].substring(4,cc[0].length()));
        int y=Integer.parseInt(cc[1].substring(4,cc[1].length()));
        int z=Integer.parseInt(cc[2].substring(4,cc[2].length()));
        //System.out.println(x+" "+y+" "+z);
        if(x>=x1 && x<=x2 && y>=y1 && y<=y2 && z>=z1 && z<=z2)
        val+=hm.get(p);
        }
        System.out.println(val);
        }
        }
        }
    }
}
