class Solution{   
public:
    
    int bs(vector<int> v, int x) {
        
        int l = 0, h = v.size() - 1, m = 0;
        
        while (l + 1 < h) {
            
            m = l + (h - l)/2;
            
            if (x == v[m]) {
                return m;
            }
            
            else if (x > v[m]) {
                l = m;
            }
            
            else {
                h = m - 1;
            }
        }
        
        if (x >= v[l] and x < v[h]) {
            return l;
        }
        
        return h;
    }
    
    
    vector<int> printKClosest(vector<int> arr, int n, int k, int x) {
        // code here
        
        int t = bs(arr, x), i, j;
        
        if (arr[t] == x) {
            i = t - 1;
            j = t + 1;
        }
        
        else {
            i = t;
            j = t + 1;
        }
        
        
        // cout << arr[t];
        
        vector<int> v;
        while (k--) {
            
            if (i >= 0 and j < n) {
                
                if (abs(x - arr[i]) == 0) {
                    i--;
                    k++;
                    continue;
                }
                
                else if (abs(x - arr[j]) == 0) {
                    j++;
                    k++;
                    continue;
                }
                
                else if (abs(x - arr[i]) >= abs(x - arr[j])) {
                    v.push_back(arr[j]);
                    j++;
                }
                
                else {
                    v.push_back(arr[i]);
                    i--;
                }
            }
            
            else if (i >= 0) {
                v.push_back(arr[i]);
                i--;
            }
            
            else {
                v.push_back(arr[j]);
                j++;
            }
        }
        
        return v;
        
    }
};