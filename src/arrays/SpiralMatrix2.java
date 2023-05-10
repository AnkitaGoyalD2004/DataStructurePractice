package Arrays;

public class SpiralMatrix2 {
    public static void mian(String[] args) {
    }

    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        // Base case
        if (n == 0) {
            return matrix;
        }
        int rowStart = 0;
        int rowEnd = n-1 ;
        int colStart = 0;
        int colEnd  = n-1;
        int num =1;
        while(rowStart <= rowEnd && colStart<= colEnd ){
            for(int i = colStart ;i <= colEnd ; i++){
                matrix[rowStart][i] = num;
                num++ ;
            }
            rowStart++ ;
            for(int i = rowStart ; i<= rowEnd ;i++){
                matrix[i][colEnd] = num;
                num++ ;
            }
            colEnd-- ;
            for (int i = colEnd; i >= colStart; i --) {
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = num;
                    num++ ; 
            }
            rowEnd --;
            
            for (int i = rowEnd; i >= rowStart; i --) {
                if (colStart <= colEnd)
                    matrix[i][colStart] = num;
                    num++ ; 
            }
            colStart ++;
        }
         return matrix;
    }
}
