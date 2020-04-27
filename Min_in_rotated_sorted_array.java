public int findMin(int[] nums) {

    if(nums.length==1)
        return nums[0];
    
    int pivot = findPivot(nums,0,nums.length-1);
    
    if(pivot==-1)
        return findMin(nums,0,nums.length-1,Integer.MAX_VALUE); 
    
    return nums[pivot+1];       
}


public int findMin(int[] nums, int low, int high,int min){
    
    if(low>high)
        return Integer.MAX_VALUE;       
    
    int mid = low + (high-low)/2;
    
    if(nums[mid]<min)
        min = nums[mid];
    
    min = Math.min(min,Math.min(findMin(nums,low,mid-1,min),findMin(nums,mid+1,high,min)));
       
    return min;            
    
}

  public int findPivot(int[] nums, int low, int high){
    
    if(low>high)
        return -1;       
    
    int mid = low + (high-low)/2;
    
    if((mid+1)<nums.length && ((nums[mid+1]) < nums[mid]))
        return mid;
    
    int searchL = findPivot(nums,low,mid-1);
    int searchR = findPivot(nums,mid+1,high);
    
    if(searchL!=-1)
        return searchL;
    else            
        return searchR;            
    
}