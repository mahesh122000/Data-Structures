public List<String> letterCombinations(String digits) {
        String s[]=new String[10];
        s[2]="abc";
        s[3]="def";
        s[4]="ghi";
        s[5]="jkl";
        s[6]="mno";
        s[7]="pqrs";
        s[8]="tuv";
        s[9]="wxyz";
        int n=digits.length();
        ArrayList<String>al=new ArrayList<>();
        if(n==0)
            return al;
        for(int i=0;i<n;i++)
        {int k=Integer.parseInt(digits.charAt(i)+"");
        int p=al.size();
        if(k!=1)
        {if(p==0)
        {for(int j=0;j<s[k].length();j++)
        {al.add(s[k].charAt(j)+"");}}
        else
        {for(int j=0;j<p;j++)
        {String c=al.get(0);
        for(int q=0;q<s[k].length();q++)
        {al.add(c+s[k].charAt(q)+"");}
        al.remove(c);
        }}}
        else
        {al.clear();
        break;}}
        return al;
    }