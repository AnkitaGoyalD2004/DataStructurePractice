package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWthEqual0and1 {
	public static int countSubarr(int[] arr, int n) {
		Map<Integer, Integer> m = new HashMap<>();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			// Replacing 0's in array with -1
			if (arr[i] == 0)
				arr[i] = -1;
			sum += arr[i];
			if (sum == 0)
				count++;

			if (m.containsKey(sum))
				count += m.get(sum);

			if (!m.containsKey(sum))
				m.put(sum, 1);
			else
				m.put(sum, m.get(sum) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int n = arr.length;
		System.out.println(countSubarr(arr, n));
	}
}
