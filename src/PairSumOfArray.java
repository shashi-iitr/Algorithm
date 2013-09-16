//to find pairs- summing to a constant given number (given sorted array)

public class PairSumOfArray {

	public static void main(String[] args){
		int [] A={1,2,3,4,5,6, 8, 9, 10};
		int k=7;
		int b=pairSum(A, k);
		System.out.println("\n no. of pairs= "+ b);
		
	}
	
	static int pairSum(int []A, int k){
		int l=A.length;
		int n=l-1;
		int pairs=0;
		int i=0;
		while(i<n){
			if(A[i]+A[n]==k){
			System.out.print("("+A[i]+", "+A[n]+")");
			i++;
			n--;
			pairs++;
			}
			else if(A[i]+A[n]<k)
				i++;
			else
				n--;
		}
		
		return pairs;
	}
}
