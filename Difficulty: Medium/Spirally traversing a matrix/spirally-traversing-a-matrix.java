class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        if(mat.length==0){
            return result;
        }
        int n=mat.length;
        int m=mat[0].length;
        int left=0,top=0;
        int right=m-1;
        int bottom=n-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
