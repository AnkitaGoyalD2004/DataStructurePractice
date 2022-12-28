package BinarySearch;

public class ShipPackages {
	public int shipWithinDays(int[] weights, int days) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i : weights) {
			sum += i;
			if (i > max) {
				max = i;
			}
		}
		int result = 0;
		int start = max;
		int end = sum;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isValid(weights, days, mid)) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
	}

	public static boolean isValid(int weights[], int range, int mid) {
		int days = 1;
		int sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += weights[i];
			if (sum > mid) {
				days++;
				sum = weights[i];
			}
			if (days > range) {
				return false;
			}
		}
		return true;
	}
}
