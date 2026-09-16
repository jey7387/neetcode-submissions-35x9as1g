class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        HashSet<List<Integer>> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> s=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(s.contains(third)){
                    List<Integer> l=Arrays.asList(nums[i],nums[j],third);
                    l.sort(null);
                    hs.add(l);
                }
                s.add(nums[j]);
            }
        }
        List<List<Integer>> al=new ArrayList<>(hs);
        return al;

    }
}
