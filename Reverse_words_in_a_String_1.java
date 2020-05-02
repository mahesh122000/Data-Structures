class Solution {
    public String reverseWords(String s) {
        List<String>c=Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(c);
        return String.join(" ",c);
    }
}