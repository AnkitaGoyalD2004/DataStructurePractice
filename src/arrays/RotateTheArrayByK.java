package Arrays;

import java.util.Scanner;

public class RotateTheArrayByK {
    // with extra space
    static int[] rotate1(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // without extra space

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter array Size : ");
        int n = sca.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sca.nextInt();

        System.out.print("Original Array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        rotate(arr, k);
        System.out.print("Array after rotation");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
