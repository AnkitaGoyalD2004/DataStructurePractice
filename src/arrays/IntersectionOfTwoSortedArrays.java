package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class IntersectionOfTwoSortedArrays {

	
	public static int[] intersect(int[] nums1, int[] nums2) {
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);
	    int M = nums1.length;
	    int N = nums2.length;
	    List<Integer> r = new ArrayList<Integer>();
	    int i = 0;
	    int j = 0;
	    while( i < M && j < N){
	        while(i < M && j < N && nums1[i] < nums2[j]) i++;
	        while(i < M && j < N && nums1[i] > nums2[j]) j++;
	        while(i < M && j < N && nums1[i] == nums2[j]){
	            r.add(nums1[i]);
	            i++;
	            j++;
	        }
	    }
	    int L = r.size();
	    int[] res = new int[L];
	    for(i = 0; i < L; i++){
	        res[i] = r.get(i);
	    }
	    return res;
	}
	public static void main(String[] args) {
		int arr1[] = {2,2,3,3,3,4,4};
		int arr2[] = {4,4,5,5,6,7};
		int ans[] = intersect(arr1 , arr2);
		for(int i = 0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
		}
	}


