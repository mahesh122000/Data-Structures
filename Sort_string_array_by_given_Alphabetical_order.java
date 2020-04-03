public String[] sortByOrder(String[] words, String alphabets )
    {
        Comparator<String> comp = new Comparator<String>() 
    { 
        @Override
        public int compare(String a, String b)  
        { 
            for(int i = 0;i <=Math.min(a.length(),b.length()); i++) 
            {   if(i==Math.min(a.length(),b.length()))
                 return a.length()-b.length();
                 else
                 {if (alphabets.indexOf(a.charAt(i)) == alphabets.indexOf(b.charAt(i)))  
                    continue; 
                else if(alphabets.indexOf(a.charAt(i)) > alphabets.indexOf(b.charAt(i))) 
                    return 1; 
                else
                    return -1; 
                 }
            } 
            return 0; 
        } 
    }; 
    Arrays.sort(words,comp); 
    return words;
} 