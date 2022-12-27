package BinarySearch;

public class MinimizedMaximumProducts {
	
	public static int minimizedMaximized(int n , int quantaties[]) {
		int max = 0;
		for(int i:quantaties) {
			if(i>max) {
				max=i;
				}
		}
		int result = 0,start = 0,end = max,mid=0;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(isvalid(quantaties,n,mid)) {
				result = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return result;
	}

	public static boolean isvalid(int arr[],int n , int mid) {
		int stores = 0;
		for(int i = 0 ; i < arr.length;i++) {
			stores += Math.ceil(arr[i]/(mid*1.0));
			if( stores >n) return false;
		}
		return true;
		
	}
}
