class Solution {
    public int[][] merge(int[][] in) {
        ArrayList<int[]> al=new ArrayList<>();
        int i=0;
        int n=in.length;
        int curr[]=new int[2];
        Arrays.sort(in,(a,b)->Integer.compare(a[0],b[0]));
       curr=in[0];
       i=1;
       while(i<n){
            if(curr[1]>=in[i][0]){
                curr[1]=Math.max(curr[1],in[i][1]);
            }
            else{
                al.add(curr);
                curr=in[i];
            }
            i++;
       }
       al.add(curr);
        
        
        return al.toArray(new int[al.size()][]);
    }
}
