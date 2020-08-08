String encode(String str)
	{
          String ans="";
          char c=str.charAt(0);
          int val=1;
          for(int i=1;i<str.length();i++)
          {
              if(c==str.charAt(i))
              {
                  val++;
              }
              else
              {
                  ans+=c;
                  ans+=val+"";
                  val=1;
                  c=str.charAt(i);
              }
          }
          ans+=c;
          ans+=val+"";
          return ans;
	}