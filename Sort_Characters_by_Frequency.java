class Solution {
    public String frequencySort(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int count = map.get(c);
            while(count != 0){
                sb.append(c);
                count--;
            }
        }
        return sb.toString();
    }
}