/*class Solution {
    static void reverse(int[]a,int i,int j){
        while(i<j){
            int tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--;
        }
    }
    public void rotate(int[][] m) {
        int n=m[0].length;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tem=m[j][i];
                mat[i][j]=tem;;
            }
        }
        for(int i=0;i<n;i++){
             reverse(mat[i],0,n-1);        
            }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tem=mat[i][j];
                m[i][j]=tem;
            }
        }
    }
}
*/





class Solution {
    static void reverse(int[]a,int i,int j){
        while(i<j){
            int tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--;
        }
    }
    public void rotate(int[][] m) {
        int n=m[0].length;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tem=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=tem;
            }
        }
        for(int i=0;i<n;i++){
             reverse(m[i],0,n-1);        
            }
        
        
    }
}