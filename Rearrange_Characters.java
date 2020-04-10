public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     String c=s.next();
	     HashMap<Character,Integer>hm=new HashMap<>();
	     int max=0;
	     for(int i=0;i<c.length();i++)
	     {if(hm.containsKey(c.charAt(i)))
	     {int k=hm.get(c.charAt(i));
	     k++;
	     max=Math.max(max,k);
	     hm.put(c.charAt(i),k);
	     }
	     else
	     {hm.put(c.charAt(i),1);}
	     }
	     if(max*2<=c.length()+1)
	     System.out.println("1");
	     else
	     System.out.println("0");
	 }
	 }