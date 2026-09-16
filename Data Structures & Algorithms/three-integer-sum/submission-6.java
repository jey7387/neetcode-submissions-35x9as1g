class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<List<Integer>> hs=new HashSet<>();
        int i=0;
        while(i<n){
            if( i>0 && nums[i]==nums[i-1]) i++;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                 List<Integer> l=Arrays.asList(nums[i],nums[j],nums[k]);
                hs.add(l);
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
            }
            else if(sum<0) j++;
            else k--;

        } i++;
        }
          List<List<Integer>> al=new ArrayList<>(hs);
           return al;


        }
        
    }

