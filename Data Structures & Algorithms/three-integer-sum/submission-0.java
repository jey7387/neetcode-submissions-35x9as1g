class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<n;i++){
             HashSet<Integer> h=new HashSet<>();
            for(int j=i+1;j<n;j++){
               
                int third=-(nums[i]+nums[j]);
                if(h.contains(third)){
                    List<Integer> li=Arrays.asList(nums[i],nums[j],third);
                    li.sort(null);
                    //collections.sort(null);
                    hs.add(li);
                }
                h.add(nums[j]);    
            }
        }
        List<List<Integer>> ll=new ArrayList<>(hs);
        return ll;
    }
}
