package AdityaVermaBinarySearch;

public class SearchA2DMatrix {
	// first approach
	public static  boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
        
        return false;
    }
	// second approach
public boolean searchMatrix1(int[][] matrix, int target) {
        
        int row1 = 0 , row2 = matrix.length - 1;
        int col1 = 0 , col2 = matrix[0].length - 1;
        
        while (row1 < row2) {
            int mid = (row1 + row2) / 2;
            if (matrix[mid][col2] == target) {
                return true;
            }
            else if (target < matrix[mid][col2]) {
                row2 = mid;
            }
            else {
                row1 = mid + 1;
            }
        }
        
        while (col1 <= col2) {
            int mid = (col1 + col2) / 2;
            if (matrix[row2][mid] == target) {
                return true;
            }
            else if (target < matrix[row2][mid]) {
                col2 = mid - 1;
            }
            else {
                col1 = mid + 1;
            }
        }
        
        return false;
    }
}
