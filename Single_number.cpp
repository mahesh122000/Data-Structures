 vector<int> singleNumber(vector<int>& nums) {
        int Xor = 0;
        for(int i=0;i<nums.size();i++) {
            Xor ^= nums[i];
        }
        
        // find rightmost set bit
        int mask = 1;
        while(1) {
            if((mask & Xor) == 0) {
                mask = mask << 1;
            }
            else break;
        }
        
        int a = 0, b = 0;
        for(int i=0;i<nums.size();i++) {
            if((nums[i] & mask) == 0) {
                a ^= nums[i];
            }
            else {
                b ^= nums[i];
            }
        }
        return { a, b };
    }
};