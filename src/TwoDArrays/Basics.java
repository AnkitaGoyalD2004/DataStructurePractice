package TwoDArrays;

import java.util.Scanner;

public class Basics {

    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // we can take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter " + r * c + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);

        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Array Literals
        // printArray(arr2);
    }
}
