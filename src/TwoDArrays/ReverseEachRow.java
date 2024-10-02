package TwoDArrays;

public class ReverseEachRow {
 static void reverse(int[][] a){
    for(int i = 0 ; i < a.length ; i++){
        for(int j = a[i].length -1  ; j>=0 ; j--){
            System.out.print(a[i][j]);
        }
        System.out.println();
    }

 }

    public static void main(String[] args) {
             // Example matrix
             int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            };
    
            // Call the function to print the reverse of each row
            reverse(matrix);
        }
    }
