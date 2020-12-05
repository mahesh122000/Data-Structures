class GfG{
   int noOfPoints(int x[],int y[],int n) {
       int ans=0;
       for(int i=0;i<n;i++)
       {
           int o=1,v=0,h=0;
           int max=0;
           HashMap<String,Integer>hm=new HashMap<>();
           for(int j=i+1;j<n;j++)
           {
               int xd=x[j]-x[i];
               int yd=y[j]-y[i];
               if(xd==0 && yd==0)
               o++;
               else if(xd==0 && yd!=0)
               v++;
               else if(xd!=0 && yd==0)
               h++;
               else
               {
                   int g=gcd(yd,xd);
                   xd/=g;
                   yd/=g;
                   String str=Integer.toString(yd)+"$"+Integer.toString(xd);
                   hm.put(str,hm.getOrDefault(str,0)+1);
                   max=Math.max(max,hm.get(str));
               }
           }
           ans=Math.max(ans,(Math.max(max,Math.max(v,h))+o));
       }
       return ans;
   }
   int gcd(int a,int b)
   {
       if(b==0)
       return a;
       return gcd(b,a%b);
   }
}