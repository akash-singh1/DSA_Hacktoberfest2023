class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(matrix[r][c]==0){
                    row.add(r);
                    col.add(c);
                }
            }
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(row.contains(r) || col.contains(c)){
                    matrix[r][c]=0;
                }
            }

        }
    }
}
