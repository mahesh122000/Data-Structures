public String intToRoman(int num) {
        if(num==0)
            return "";
        String rom[]=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int nums[]=new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String ans="";
        int i=12;
        while(num>0)
        {int k=num/nums[i];
        num=num%nums[i];
        while(k-->0)
        {ans+=rom[i];}
        i--;}
        return ans;
    }