class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int n=nums.length;
        ArrayList<Integer>[]a=new ArrayList[n+1];
         for(Map.Entry<Integer,Integer> m:map.entrySet()){
              int index=m.getValue();
              if(a[index]==null){
                a[index]=new ArrayList<>();
              }
              a[index].add(m.getKey());
         }
         int j=0;
         List<Integer> l=new ArrayList<>();
        
         for(int i=n;i>0 ;i--){
            if(a[i]!=null && j<k){
                for(int x:a[i]){  
                     l.add(x);
                     j++;
                     if(j==k) break;
            }
         }}
          int[]ans=new int[l.size()];

        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;

    }
}
