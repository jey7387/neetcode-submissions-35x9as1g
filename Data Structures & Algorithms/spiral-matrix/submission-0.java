class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int n=m.length;
        ArrayList<Integer> al=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=m.length-1;
        int right=m[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                al.add(m[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                al.add(m[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                 al.add(m[bottom][i]);
            }}
            bottom--;
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                al.add(m[i][left]);
            }}
            left++;

        }
        return al;   
     


    }
}
