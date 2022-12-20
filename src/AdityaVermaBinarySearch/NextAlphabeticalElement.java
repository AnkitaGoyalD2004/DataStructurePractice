package AdityaVermaBinarySearch;

public class NextAlphabeticalElement {

	 public static char nextGreatestLetter(char[] letters, char target) {
	        char result=letters[0];
	        int start=0;
	        int end=letters.length-1;
	        while(start<=end)
	        {
	            int mid=start+(end-start)/2;
	            if(letters[mid]==target)
	            {
	                start=mid+1;
	            }
	            else if(target>letters[mid])
	            {
	                start=mid+1;
	            }
	            else if(letters[mid]>target)
	            {
	                result=letters[mid];
	                end=mid-1;
	            }
	        }
	        return result;
	 }
	 public static void main(String[] args) {
			char arr[] = {'a','b','c','e'};
			System.out.print(nextGreatestLetter(arr,'e'));

		}
}
