// search for an element in sorted array rotated by a pivot

public class RotatedBinarySearch {

	public static void main(String [] agrs){
		int [] A={6,7,1,2,3,4,5};
		int n=A.length-1;
		int k=1;
		int i=0;
		while(i<n && A[i]<A[i+1]){
			i++;
		}
		int b=0;
		if(k==A[i]){
			System.out.print(i);
			System.exit(0);
		}
		if(k>=A[0]){
			b=rotatedBinarySearch(A, 0, i, k);
		} else{
			b=rotatedBinarySearch(A, i+1, n, k);
		}
		System.out.print(b);
	}
	
	
	static int rotatedBinarySearch(int [] A, int i, int n, int k){

		int mid=(i+n)/2;
		if (i < 0 || n < 0 || n < i)
			return -1;
		if(A[mid]==k){
			return mid;
		} else if(A[mid]>k){
			return rotatedBinarySearch(A, i, mid-1, k);
		} else if(A[mid]<k){
			return rotatedBinarySearch(A, mid+1, n, k);
		}
		return -1;
	}
}