class Solution {
    public String largestTimeFromDigits(int[] a) {
        String ans = "";
        for (int i = 0; i < 4; i++) {
            if (a[i] > 2) continue;
            for (int j = 0; j < 4; j++) {
                if (i == j || (a[i] == 2 && a[j] > 3)) continue;
                for (int k = 0; k < 4; k++) {
                    if (i == k || k == j || a[k] > 5) continue;
                    int r = 6 - i - j - k;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a[i]).append(a[j]).append(":").append(a[k]).append(a[r]);
                    String temp = sb.toString();
                    if (ans.compareTo(temp) < 0) ans = temp;
                }
            }
        }
        return ans;
    }
}