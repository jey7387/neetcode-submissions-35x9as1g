class Solution {
    public int longestConsecutive(int[] nums) {
        int c=0,n=nums.length,k=0,max=0;
        
        HashSet<Integer> h=new HashSet<>();
        for(int x:nums){
            h.add(x);
        }
       
        for(int x:nums){
            if(!h.contains(x-1)){
                   k=x+1;
                   c=1;
                    while(h.contains(k)){
                        k=k+1;
                        c++;
                    }
                    max=Math.max(max,c);
                }
            }
            return max;
        }
    }

