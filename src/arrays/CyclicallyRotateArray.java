package arrays;

public class CyclicallyRotateArray {

	public static void reverse(int a[],int i,int j) {
		int li = i, ri = j;
		while(li<ri) {
			int temp = a[li];
			a[li] = a[ri];
			a[ri] = temp;
			li++;
			ri--;
		}
	}
	public static void rotate(int a[], int k) {
		k=k%a.length;
		if(k<0) k=k+a.length;
		// part1
		reverse(a,0, a.length-k-1);
		// part2
		reverse(a,a.length-k,a.length-1);
		// all
		reverse(a,0,a.length-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-100,3,99};
		int k = 2;
		rotate(arr,k);
		for(int i:arr)
			System.out.print(i+" ");

	}

}
