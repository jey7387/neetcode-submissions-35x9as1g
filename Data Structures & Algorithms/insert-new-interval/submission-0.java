class Solution {
    
    public int[][] insert(int[][] in, int[] newin) {
              ArrayList<int[]> al=new ArrayList<>();
              int n=in.length;
            int  i=0;
              while(i<n && in[i][1]<newin[0]){
                  al.add(in[i]);
                  i++;
              }
              while(i<n && in[i][0]<=newin[1]){
                newin[0]=Math.min(in[i][0],newin[0]);
                newin[1]=Math.max(in[i][1],newin[1]);
                i++;
              }
                al.add(newin);
                while(i<n){
                    al.add(in[i]);
                    i++;
                }
            return al.toArray(new int[al.size()][]);
            
            }
        }  
 
