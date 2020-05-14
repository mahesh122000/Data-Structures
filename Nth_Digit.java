class Solution {
    int[] array={0, 9, 189, 2889, 38889, 488889, 5888889, 68888889, 788888889};
    public int findNthDigit(int n) {
        if(n==0)
            return 0;
       int index=Arrays.binarySearch(array,n);
        if(index<0)
            index=-index-1;
        int val=(int)Math.pow(10,index-1)+(n-array[index-1]-1)/index;
        int r=(n-array[index-1]-1)%index;
        return Integer.toString(val).charAt(r)-'0';
    }
}

