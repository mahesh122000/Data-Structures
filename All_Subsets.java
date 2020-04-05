 public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<Math.pow(2,nums.length);i++)
        {List<Integer>l=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {if(((1<<j)&i)>>j==1)
        {l.add(nums[j]);
       // System.out.print(nums[j]+" ");
        }
        }
        // System.out.println();
        al.add(l);}
        return al;
    }
}