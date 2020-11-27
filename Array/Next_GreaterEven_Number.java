import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static String ans="";
    public static void swap(char ch[],int i,int j){
        char te=ch[i];
        ch[i]=ch[j];
        ch[j]=te;
    }
    public static boolean find(String s){
        char ch[]=s.toCharArray();
        int last=ch.length-1,i,j;
        boolean violate=false;
        for(i=ch.length-2;i>=0;i--){
            if(ch[last]>ch[i]){
                violate=true;
                break;
            }
            last=i;
        }
        if(violate){
            for(j=ch.length-1;j>i;j--){
                if(ch[j]>ch[i])
                break;
            }
            swap(ch,i,j);
            Arrays.sort(ch,i+1,ch.length);
            String st=new String(ch);
            if((ch[ch.length-1]-'0')%2==0)
            {
                ans=st;
                return true;
            }
            else
            {
                return find(st);
            }
        }
        else
        return false;
    }
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    ans="";
		    String s=in.next();
		    boolean flag=false;
		    while(true){
		        if(find(s)){
		            flag=true;
		            break;
		        }else{
		           break; 
		        }
		    }
		    if(!flag)
		    System.out.println("-1");
		    else
		    System.out.println(ans);
		}
	}
}