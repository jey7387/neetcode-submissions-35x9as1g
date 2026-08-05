class Solution {
    public int eraseOverlapIntervals(int[][] in) {
          Arrays.sort(in,(a,b)->Integer.compare(a[1],b[1]));
          int c=1;
          int n=in.length;
          int i=1;
          int[] cur=new int[2];
          cur=in[0];
          while(i<n){
               if(cur[1]<= in[i][0]){
                c++;
                cur=in[i];
               }
               i++;
          }
          return n-c;

    }
}
