//merge two sorted array in sorted form

public class Arraymerge {
	public static void main(String[] args) {

		int[] A = { 1, 3, 5, 8, 10, 14, 19, 23, 28 };
		int la = A.length;

		int[] B = { 2, 4, 7, 8, 11, 13, 20, 23, 26, 30 };
		int lb = B.length;

		int[] C = mergeArray(A, la, B, lb);
		for (int i = 0; i < la + lb; i++) {
			System.out.print(C[i] + ", ");
		}
	}

	static int[] mergeArray(int[] A, int la, int[] B, int lb) {
		int a = 0, b = 0, j = 0;
		int[] C = new int[la + lb];
		while (a < la && b < lb) {
			if (A[a] < B[b]) {
				C[j++] = A[a];
				a++;
			} else if (A[a] > B[b]) {
				C[j++] = B[b];
				b++;
			} else if (A[a] == B[b]) {
				C[j++] = A[a];
				C[j++] = B[b];
				a++;
				b++;
			}
		}
		while (a < la) {
			C[j++] = A[a];
			a++;
		}
		while (b < lb) {
			C[j++] = B[b];
			b++;
		}
		return C;
	}
}
