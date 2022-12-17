package BinarySearch;

public class SearchInReverseSortedArray {

	public static  int searchEle(int arr[], int x) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+ (end - start) / 2;
          if (x == arr[mid]) return mid;
          else if (x < arr[mid]) {
              start = mid + 1;
          }
          else {
              end = mid - 1;
          }
      }
      return -1;
  }
  public static void main(String[] args)
  {
      int arr[] = { 6, 9, 14, 12, 8};
      int x = 8;
      System.out.println(searchEle(arr, x));
 }
	}
