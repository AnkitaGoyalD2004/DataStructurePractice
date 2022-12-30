package BinarySearch;
import java.util.Arrays;
public class MagneticForceTwoBalls {
	public static int maxDistance(int[] position, int m) {
		Arrays.sort(position);
		int end = position[position.length-1]-position[0];
		int start = 0;
		int result = 0;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(isValid(position,m,mid)) {
				result = mid;
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return result;
	}
	public static boolean isValid(int[] arr, int range , int mid) {
		int balls=1;
		 int previous =0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]-arr[previous]>= mid) {
				balls++;
				if(balls == range) {
					return true;
					}
				previous = i;
			}
		}
		return balls == range;
		
	}
}
