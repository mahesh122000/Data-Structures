class Solution {
    int find(int arr[], int i, int n, int x) {
       while (i <= n) {
       int mid = i + (n - i) / 2;
          if (arr[mid] <= x)
                i = mid + 1;
          else if (arr[mid] > x)
                n = mid - 1;
          }
        return n + 1;
    }
    int minRemoval(int arr[], int n) {
        Arrays.sort(arr);
        int ans=n;
        for(int i=0;i<n;i++)
        {
            ans=Math.min(ans,i+n-find(arr,i+1,n-1,2*arr[i]));
        }
        return ans;
    }
}