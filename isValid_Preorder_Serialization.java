public boolean isValidSerialization(String preorder) {
     String s[]=preorder.split(",");
        int count=1;
        for(String c:s)
        {
            count--;
            if(count<0)
                return false;
            if(!c.equals("#"))
                count+=2;
        }
        return count==0;
    }