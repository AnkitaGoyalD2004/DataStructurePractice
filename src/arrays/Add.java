package AdityaVermaBinarySearch;

public class Add {
    public static void totalSum(int[][] mat) {
        int sum = 0;
        int ArrSize = mat.length;
        int commonDiagonal = 0;
    
        if (ArrSize == 0) {
            System.out.println(sum); // Empty matrix, sum is 0
            return;
        }
    
        // Top & bottom row
        for (int i = 0; i < ArrSize; i++) {
            sum += mat[0][i];                  // Top row
            sum += mat[ArrSize - 1][i];        // Bottom row
        }
    
        // Left & Right column start with 2nd row and end with last 2nd row
        for (int i = 1; i < ArrSize - 1; i++) {
            sum += mat[i][0];                  // Left column
            sum += mat[i][ArrSize - 1];        // Right column
        }
    
        // Left & Right diagonal start with 2nd row diagonal and end with last 2nd row diagonal
        for (int i = 1; i < ArrSize - 1; i++) {
            sum += mat[i][i];                          // Left diagonal sum
            sum += mat[i][ArrSize - 1 - i];             // Right diagonal sum
        }
    
        // If ArrSize is odd, subtract the common diagonal element
        if (ArrSize % 2 == 1) {
            int ind = ArrSize / 2;
            commonDiagonal = mat[ind][ind];
            sum -= commonDiagonal;
        }
    
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        totalSum(mat);
    }
}
    