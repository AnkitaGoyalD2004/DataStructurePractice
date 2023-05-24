package HashMap;

import java.util.*;

public class DiffOfTwoArrays {

    public static void main(String[] args){
        
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = arr1(nums1, nums2);
        List<Integer> list2 = arr2(nums1, nums2);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }

    public static List<Integer> arr1(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums1) {
            s.add(i);
        }
        for (int i : nums2) {
            if (s.contains(i)) {
                s.remove(i);
            }
        }
        return new ArrayList<>(s);
    }

    public static List<Integer> arr2(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int j : nums2) {
            s.add(j);
        }
        for (int j : nums1) {
            if (s.contains(j)) {
                s.remove(j);
            }
        }
        return new ArrayList<>(s);
    }
}
