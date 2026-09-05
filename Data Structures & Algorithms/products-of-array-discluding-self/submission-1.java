class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*ArrayList<Integer> al=new ArrayList<>();
        int n=nums.length;
        int mul=1;
        for(int i=0;i<n;i++){
            mul=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                mul*=nums[j];}
            }
            al.add(mul);
        }
        int []a=new int[al.size()];
        int j=0;
        for(int x:al){
          a[j]=x;
          j++;
        }
        return a;*/
        int n=nums.length;
        int []r=new int[n];
        int pre=1,post=1;
        Arrays.fill(r,1);
        for(int i=0;i<n;i++){
            r[i]*=pre;
            pre*=nums[i];
        }
        for(int j=n-1;j>=0;j--){
            r[j]*=post;
            post*=nums[j];
        }
        return r;

        
    }
}  
