
public class SortTwoSortedArr {

	public static void main(String[] args){
		int[] A = { 1, 3, 5, 8, 10, 14, 19, 23, 26, 28, 51, 52, 54, 55 };
		int la = A.length;
		
		int[] B = { 2, 4, 7, 8, 11, 13, 18, 20, 23, 26, 30, 31};
		int lb = B.length;
		
		mergeArray(A, la, B, lb);
	}
	
	
	static void mergeArray(int []A, int la, int []B, int lb){
		int dubCount=0;
		for(int i=0; i<la; i++)
			for(int j=0; j<lb; j++)
				if(A[i]==B[j])
					dubCount++;
		
		int dc=la+lb-dubCount;
		int [] C=new int [dc];
		
		int a=0, b=0, k=0;
		while(a<la && b<lb){
			C[k++]=min(A[a], B[b]);
			if(A[a]<B[b])
				a++;
			else if(A[a]>B[b])
				b++;
			else if(A[a]==B[b]){
				a++;
				b++;
			}
		}
		while(a<la){
			C[k++]=A[a];
			a++;
		}
		while(b<lb){
			C[k++]=B[b];
			b++;
		}
		for(int i=0; i<dc; i++)
			System.out.print(C[i]+" ");
	}
	
	
	static int min(int a, int b){
		return a<b?a:b;
	}
}
