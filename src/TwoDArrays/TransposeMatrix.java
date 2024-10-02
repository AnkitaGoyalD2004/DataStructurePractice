package TwoDArrays;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
         int row = matrix.length;
         int col = matrix[0].length;

         int ans[][] = new int[row][col];
         for(int i = 0 ; i  < row ; i++){
            for(int j = 0 ; j < col ; j++){
                ans[i][j] = matrix[j][i];
            }
         }
         return ans;
    }
}

