class Solution {
    int mod = 1<<30;
    public String longestDupSubstring(String S) {
        int l = 1;
        int h = S.length()-1;
        while(l<=h){
            int m = (l+h)>>1;
            int ind = find(S,m);
            if(ind==-1){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        int ind= find(S,h);
        return ind==-1? "" : S.substring(ind,ind+h);
    }
    
    public int find(String s, int n){
        long h = 0;
        long ad = 1;
        for(int i=0; i<n; i++){
            h = (h*26%mod + s.charAt(i))%mod;
            ad = ad*26%mod;
        }
        HashMap<Long,List<Integer>> hm = new HashMap();
        hm.put(h,new ArrayList<Integer>());
        hm.get(h).add(0);
        for(int i=1; i<s.length()-n+1; i++){
            h = ((h*26%mod-s.charAt(i-1)*ad%mod+mod)%mod+s.charAt(i+n-1))%mod;
            if(hm.containsKey(h)){
                for(int start : hm.get(h)){
                    if(s.substring(start,start+n).equals(s.substring(i,i+n))) return i;
                }            
            }
            else{
                hm.put(h,new ArrayList<Integer>());           
            }
            hm.get(h).add(i);     
        }
        return -1;
    }
}