package Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length,n2 = nums2.length;
        int n = n1+n2;
        int [] arr = new int[n];
        int i = 0;
        int j = 0;
        int k =0;
        while(i<n1 && j<n2){
            if(nums1[i] <nums2[j]){
              arr[k] = nums1[i]; i++;
            }else{
                arr[k] = nums2[j];j++;
            }
            k++;
        }
            while(i < n1)               
        {
            arr[k] = nums1[i++];
            k++;
        }
        while(j < n2)                  
        {                            
            arr[k] = nums2[j++];
            k++;
        }
         int n3 = arr.length;
         return n3%2==0? (arr[n3/2] + arr[(n3/2)-1])/2.0 : arr[n3/2];
        }
}
