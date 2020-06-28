long DecimalValue(Node head)
   {
       String s = "";
       while(head!=null)
        {
           s = s + head.data;
           head = head.next;
        }
       java.math.BigInteger val = new java.math.BigInteger(s,2);
       java.math.BigInteger modulo = new java.math.BigInteger("1000000007");
       java.math.BigInteger ans = val.mod(modulo);
       return ans.longValue()%1000000007;
   }