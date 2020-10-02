class GfG
{
    static final char c = '$';
    static Set<String> hs;
    public static boolean dupSub(Node root)
    {
        hs = new HashSet<String>();
        String s = find(root);
        if(s.compareTo("") == 0)
        return true;
        else
        return false;
    }
    
    public static String find(Node root)
    {
        String s = "";
        
        if(root == null)
         return s + c;
         
        String ls = find(root.left);
        if (ls.compareTo(s) == 0)
            return s;
            
        String rs = find(root.right);
       if (rs.compareTo(s) == 0)
           return s;
           
        s = s + root.data + ls + rs;
        
         if (s.length() > 3 && hs.contains(s) == true)
                return "";
                
        hs.add(s);
 
        return s;
    }
}