// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n - 1 - j];
                mat[i][n - 1 - j]=temp;
            }
        }
    }
}