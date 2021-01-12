class Solution {
    public int createSortedArray(int[] nums) {
        int mod=1000000007;
        long res=0;
        int mx=0;
        
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
        }
        
        int A[]=new int[mx+10];
        Fenwick fe=new Fenwick(A);
       
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            int less=fe.sumRange(0,cur-1);
            int large=fe.sumRange(cur+1,mx+1);
            
            res+=Math.min(less,large);
            res%=mod;
            fe.update(cur,1);
            
        }
        
        return (int)(res);
    }
    
    class Fenwick {
        int tree[];//1-index based
        int A[];
        int arr[];
        public Fenwick(int[] A) {
            this.A=A;
            arr=new int[A.length];
            tree=new int[A.length+1];
            int sum=0;
            for(int i=0;i<A.length;i++){
                update(i,A[i]);
            }
        }

        public void update(int i, int val) {
            arr[i]+=val;
            i++;
            while(i<tree.length){
                tree[i]+=val;
                i+=(i&-i);
            }
            
        }

        public int sumRange(int i, int j) {
            
            return pre(j+1)-pre(i);
        }

        public int pre(int i){
            int sum=0;
            while(i>0){
                sum+=tree[i];
                i-=(i&-i);
            }
            return sum;
        }
    }
}



/*
if the current element is index i, the problem can be modify as find how many elements with index j<i that has a value nums[j]>nums[i] and value with nums[j]<nums[i]. The query is done by n times for each i
We can create an array with size max(nums[i]+1) as A
A[i] means how many elements with value i
Number of elements less satisfy nums[j]<nums[i] is sum(A[0]...A[nums[j]]), for nums[j]>nums[i] is the same idea, we can use prefix sum to do it.
Since the value is update as we iterate through the nums array, we can use Fenwick Tree(Leetcode problem 306 is a good reference)
*/