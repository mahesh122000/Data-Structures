bool search(vector<int>& nums, int target) {
        if(nums.empty())return false;
    
    vector<int> :: iterator itr;
    
    itr = find(nums.begin(), nums.end(), target);
    
    if(itr != nums.end()) return true;
    else return false;
    }