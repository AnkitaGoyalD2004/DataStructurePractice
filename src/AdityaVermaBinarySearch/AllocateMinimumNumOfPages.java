package AdityaVermaBinarySearch;

public class AllocateMinimumNumOfPages {
	public static int findPages(int [] A, int N,int M) {
		if(N<M) {
			return -1;
			}
		int result = -1, start=0,end=0;
		for(int i:A) {
			end +=i;
			if(i>start) {
				start = i;
				}
		}
		while(start<=end) {
		int	mid = start+(end-start)/2;
			if(isValid(A,N,M,mid)) {
				result = mid;
				end = mid-1;
			}else {
				start =mid+1;
			}
		}
		return result;
	}
	private static boolean isValid(int arr[], int n , int m , int max) {
		int student = 1;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum +=arr[i];
			if(sum>max) {
				student++;
				sum =arr[i];
			}
			if(student>m) {
				return false;
			}
		}
		return true;
	}

}