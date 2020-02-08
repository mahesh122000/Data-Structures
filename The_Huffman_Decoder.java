public static String decode(List<String> codes, String encoded) {
    int k=0;
    String ans="";
    while(k<encoded.length())
    {
    for(int i=0;i<codes.size();i++)
    {String c[]=codes.get(i).split("\t");
    if(k+c[1].length()>encoded.length())
    {}
    else
    {if(c[1].equals(encoded.substring(k,k+c[1].length())))
    {if(c[0].equals("[newline]"))
        ans+="\n";
    else
       ans+=c[0];
    k=k+c[1].length();}}      
    }}
    return ans;}