// Binary search

public class BinarySearch {

	public static void main(String[] args) {

		int n=19, m=6, x=23;
		int []A={11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,32};
		
		int b=binarySearch(A,m,n,x);
		System.out.print(b);
	}
	
	
	static int binarySearch(int []A, int m, int n, int x){
		int mid=(n+m)/2;
		
		if (n < 0 || m < 0 || n < m)
			return -1;
		if (A[mid] == x)
			return mid;
		if (A[mid] < x)
			return binarySearch(A, mid + 1, n, x);
		if (A[mid] > x)
			return binarySearch(A, m, mid - 1, x);
		
		return -1;
	}
}
